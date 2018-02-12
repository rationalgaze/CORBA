package tpcorba.exo4;

import org.omg.CORBA.*;
import org.omg.PortableServer.*;
import java.util.*;

public class gestionabonnesImpl extends gestionabonnesPOA
{
	// Reference sur la POA
	protected  POA poa_;
  private Map<Integer, abonneImpl> abonnes = new HashMap<Integer, abonneImpl>();

	public  gestionabonnesImpl(POA poa)
	{
		poa_=poa;
	}

	//***	
  public void creation_abonne(int numero, String nom, String prenom, abonneHolder ref) throws dejaExistant
  {  
    abonneImpl abonneimpl = new abonneImpl(numero, nom, prenom);
    if(abonnes.containsKey(numero)){
      throw new dejaExistant();
    } 
    
    abonnes.put(numero,abonneimpl);

    try {
      ref.value = abonneHelper.narrow(poa_.servant_to_reference(abonneimpl));
    } catch (Exception e) {
      System.err.println("Erreur Narrow " + e);
    }    
  }
  
  public void rechercher_abonne(int numero,  abonneHolder ref) throws numeroInconnu {

    if(!abonnes.containsKey(new Integer(numero))) { 
  		throw new numeroInconnu();
  	}
  	System.out.println(abonnes.containsKey(new Integer(numero)));
  	try{
  	  ref.value = abonneHelper.narrow(poa_.servant_to_reference(abonnes.get(numero)));
  	} catch (Exception e) {
       System.err.println("Erreur Narrow " + e);
    }
  	
  }
  
  public void resilier_abonne(int numero) throws numeroInconnu {
  
    if(!abonnes.containsKey(numero)) { 
  		throw new numeroInconnu();
  	}
  	abonneHolder ref = new abonneHolder();
  	try{
  	  ref.value = abonneHelper.narrow(poa_.servant_to_reference(abonnes.get(numero)));
  	} catch (Exception e) {
       System.err.println("Erreur Narrow " + e);
    }
    
    abonnes.remove(numero);
    
    // Desactive l'objet CORBA
    try {
      byte[] ObjID = poa_.reference_to_id(ref.value);
      poa_.deactivate_object(ObjID);
    } catch (Exception e) {
      System.out.println("POA Exception " + e);
    }
	}
	
}
