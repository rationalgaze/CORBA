
package tpcorba.exo3;

import org.omg.CORBA.*;
import java.lang.*;


public class compteImpl extends comptePOA
{
  private int numero_compte;
  private String titulaire;
  private double solde;
  private int counter;
  
	public compteImpl(String t, int num)
	{
	  this.numero_compte = num;
	  this.titulaire = t;
	  this.solde = 0;
	  this.counter = 0;
	}
	
  //		****
  public int numero_compte()
  {
    return numero_compte;
  }
  
  public void nombre_operations(IntHolder nombre) {
    nombre.value = counter;
  }
  
  public String titulaire()
  {
    return titulaire;
  }

	public void debiter(double montant){
	  this.solde -= montant;
	  counter++;
	}
	
	public void crediter(double montant){
	  this.solde += montant;
	  counter++;;
	}

	public void prelevement(double montant, compte destination){
	  this.debiter(montant);
	  destination.crediter(montant);
	  counter++;
	}
	
	public double solde()
  {
    return solde;
  }
}


