

package tpcorba.exo5;

import org.omg.CORBA.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.PortableServer.*;

import java.util.*;
import java.io.*;
import java.lang.*;

public class Serveur 
	{
	public static void main(String args[]) throws IOException
		{ 

  	    	try {
			ORB orb = ORB.init(args, null);
			POA poa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            		poa.the_POAManager().activate();

			etudiantImpl etu = new etudiantImpl("Dupont", "Robert");
			org.omg.CORBA.Object refetu = poa.servant_to_reference(etu);

   		

			// ETAPE 1
			// resolve_initial_references permet à un client d'obtenir la 
		  // référence sur le serveur de désignation (ou serveur de nom). 
		  // La référence est ici  "non typée" car plusieurs services de base CORBA peuvent
		  // exister au sein d'un ORB. "NameService" constitue le nom symbolique du service de designation.
			  
  		org.omg.CORBA.Object obj=orb.resolve_initial_references("NameService");
	
			if(obj == null)
		   		{
		   		System.out.println("Reference nil sur `NameService'");
		   		System.exit(1);
				}


			// ETAPE 2
			// le client construit une souche à partir de la référence 
			// d'objet CORBA afin de pouvoir invoquer le serveur de 
			// désignation. Avec la souche ainsi construite toutes les 
			// méthodes de l'interface "NamingContext" sont accessibles

      NamingContext nc = NamingContextHelper.narrow(obj);
      if(nc == null)
      {
	   		System.out.println("Reference type nil sur `NameService'");
	   		System.exit(1);
      }
    

			// ETAPE 3
			// On construit le nom symbolique de l'objet à invoquer
			// (initialisation d'un tableau de "NameComponent")
			// Le nom symbolique est celui de l'objet APPLICATIF, instancié
			// par "Serveur.java"
			NameComponent[] aName = new NameComponent[1];
	       		aName[0] = new NameComponent();
	       		aName[0].id = "etudiant1";
		       	aName[0].kind = "donnee";


			
			// ETAPE 4
			//On invoque le serveur de désignation, en retour, on reçoit
			// une référence d'objet CORBA "non typ"e" sur l'objet que l'on
			// souhaite invoquer. Par l'opération "resolve", le serveur de 
			// désignation recherche l'association "référence d'objet" nom symbolique 
			nc.rebind(aName, refetu);	

  		System.out.println("Le serveur est pret ");
			orb.run();
      
  
			System.exit(0);
		}

		catch(CannotProceed ex)
		    {
		    System.out.println("CannotProceed sur bind");
		    System.exit(1);
		    }
		catch(InvalidName ex)
		    {
		    System.out.println("InvalidName sur bind ou recherche NameService");
		    System.exit(1);
		    }
		catch(NotFound ex)
		    {
		    System.out.println("NotFound sur bind");
		    System.exit(1);
		    }
		catch (Exception e) 
		    {
		    System.out.println(e);
		    }
	}

}

