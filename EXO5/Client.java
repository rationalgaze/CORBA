

package tpcorba.exo5;


import org.omg.CORBA.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;

import java.lang.*;
import java.util.*;
import java.io.*;




public class Client
	{


	public static void main(String args[]) throws IOException
		{ 

		ORB orb = ORB.init(args, null);
		org.omg.CORBA.Object obj = null;

		// ETAPE 1
		// resolve_initial_references permet à un client d'obtenir la 
		// référence sur le serveur de désignation (ou serveur de nom). 
		// La référence est ici  "non typée" car plusieurs services de base CORBA peuvent
		// exister au sein d'un ORB. "NameService" constitue le nom symbolique du service de designation.
 		try	{
			obj = orb.resolve_initial_references("NameService");
		}
		catch(org.omg.CORBA.ORBPackage.InvalidName ex)
   	{
	   	System.out.println("'NameService' inaccessible");
	   	System.exit(1);
		}

			
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
    
 		try	{
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
			// On invoque le serveur de désignation, en retour, on reçoit
			// une référence d'objet CORBA "non typée" sur l'objet que l'on
			// souhaite invoquer. Par l'opération "resolve", le serveur de 
			// désignation recherche l'association "référence d'objet" nom symbolique 
			obj=nc.resolve(aName);
		}
		catch(CannotProceed ex)
		{
	  	System.out.println("CannotProceed sur resolve");
	  	System.exit(1);
		}
		catch(InvalidName ex)
		{
	   	System.out.println("InvalidName sur resolve");
	   	System.exit(1);
		}
		catch(NotFound ex)
		{
	   	System.out.println("NotFound sur resolve");
	   	System.exit(1);
		}

		// ETAPE 5
		// le Client construit une souche à partir de la référence 
		// d'objet CORBA qu'il souhaite invoquer
		etudiant e1 = etudiantHelper.narrow(obj);
		if(e1==null)
		{
			System.err.println("Erreur sur narrow() ");
			System.exit(0);
		}
			
		System.out.println("Etudiant1 : " + e1.nom() + " " + e1.prenom());

		System.exit(0);
	}
}

