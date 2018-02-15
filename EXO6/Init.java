package tpcorba.exo6;


import org.omg.CORBA.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;

import java.lang.*;
import java.util.*;
import java.io.*;

public class Init
{

	public static void main(String args[]) throws IOException
	{ 

		ORB orb = ORB.init(args, null);
		org.omg.CORBA.Object obj = null;

		// ETAPE 1
 		try
		{
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
		NamingContext nc = NamingContextHelper.narrow(obj);
		if(nc == null)
		{
			System.out.println("Reference type nil sur `NameService'");
			System.exit(1);
		}

		// RACINE
		try
		{
			NameComponent[] aName = new NameComponent[1];
			aName[0] = new NameComponent();
			aName[0].id = "formations professionnelles";
			aName[0].kind = "usine";

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

		usine us = usineHelper.narrow(obj);
		if(us==null)
		{
			System.err.println("Erreur sur narrow() ");
			System.exit(0);
		}


		// Creation des objets et publication vers le serveur 
		// de nom
		//
		etudiant e1=us.inscription_d_un_etudiant("e1-nom", "e1-prenom");
		etudiant e2=us.inscription_d_un_etudiant("e2-nom", "e2-prenom");
		etudiant e3=us.inscription_d_un_etudiant("e3-nom", "e3-prenom");
		etudiant e4=us.inscription_d_un_etudiant("e4-nom", "e4-prenom");
		etudiant e5=us.inscription_d_un_etudiant("e5-nom", "e5-prenom");
		etudiant e6=us.inscription_d_un_etudiant("e6-nom", "e6-prenom");


		//***
		try
		{
			NameComponent[] ncDESS = new NameComponent[1];
			ncDESS[0] = new NameComponent();
			ncDESS[0].id = "DESS";
			ncDESS[0].kind = "";
			obj=nc.resolve(ncDESS);
			
			NameComponent[] ncIUP = new NameComponent[1];
			ncIUP[0] = new NameComponent();
			ncIUP[0].id = "IUP";
			ncIUP[0].kind = "";
			obj=nc.resolve(ncIUP);
			
			NameComponent[] ncEffectif = new NameComponent[1];
			ncEffectif[0] = new NameComponent();
			ncEffectif[0].id = "Effectif";
			ncEffectif[0].kind = "";
			obj=nc.resolve(ncIUP);
			
			// NameComponent[] a1Name = new NameComponent[1];
			// a1Name[0] = new NameComponent();
			// a1Name[0].id = "e1";
			// a1Name[0].kind = "etudiant1";
			// ncDESS.bind(a1Name, e1);
			// System.out.println("etudiant1 est publie ");

			// NameComponent[] a1Name = new NameComponent[1];
			// a1Name[0] = new NameComponent();
			// a1Name[0].id = "e2";
			// a1Name[0].kind = "etudiant2";
			// ncDESS.bind(a1Name, e2);
			// System.out.println("etudiant2 est publie ");


			// NameComponent[] ncIUP1 = new NameComponent[1];
			// ncIUP1[0] = new NameComponent();
			// ncIUP1[0].id = "IUP1";
			// ncIUP1[0].kind = "";
			// NamingContext IUP1 = nc.bind_new_context(ncIUP1);
			// System.out.println("IUP1 est publie ");

			// NameComponent[] ncIUP2 = new NameComponent[1];
			// ncIUP2[0] = new NameComponent();
			// ncIUP2[0].id = "IUP1";
			// ncIUP2[0].kind = "";
			// NamingContext IUP1 = nc.bind_new_context(ncIUP2);
			// System.out.println("IUP2 est publie ");

			// NameComponent[] ncIUP3 = new NameComponent[1];
			// ncIUP3[0] = new NameComponent();
			// ncIUP3[0].id = "IUP3";
			// ncIUP3[0].kind = "";
			// NamingContext IUP1 = nc.bind_new_context(ncIUP3);
			// System.out.println("IUP est publie ");	
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
		

		System.out.println("Etudiant1 : " + e1.nom() + " " + e1.prenom());
		System.out.println("Etudiant2 : " + e2.nom() + " " + e2.prenom());
		System.out.println("Etudiant3 : " + e3.nom() + " " + e3.prenom());
		System.out.println("Etudiant4 : " + e4.nom() + " " + e4.prenom());
		System.out.println("Etudiant5 : " + e5.nom() + " " + e5.prenom());
		System.out.println("Etudiant5 : " + e6.nom() + " " + e6.prenom());

		System.exit(0);
	}
}

