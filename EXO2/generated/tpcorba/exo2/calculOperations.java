package tpcorba.exo2;

/**
 *	Generated from IDL interface "calcul"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */


public interface calculOperations
{
	/* constants */
	/* operations  */
	double memoire();
	void ajouteMemoire(double data);
	void soustraitMemoire(double data);
	void multiplieMemoire(double data);
	void MiseAZero();
	void diviseMemoire(double donnee) throws tpcorba.exo2.divisionParZero;
	void incrementer(org.omg.CORBA.IntHolder data);
	void decrementer(org.omg.CORBA.IntHolder data);
}
