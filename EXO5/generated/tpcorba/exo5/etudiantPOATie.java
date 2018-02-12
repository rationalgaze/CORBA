package tpcorba.exo5;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "etudiant"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public class etudiantPOATie
	extends etudiantPOA
{
	private etudiantOperations _delegate;

	private POA _poa;
	public etudiantPOATie(etudiantOperations delegate)
	{
		_delegate = delegate;
	}
	public etudiantPOATie(etudiantOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public tpcorba.exo5.etudiant _this()
	{
		return tpcorba.exo5.etudiantHelper.narrow(_this_object());
	}
	public tpcorba.exo5.etudiant _this(org.omg.CORBA.ORB orb)
	{
		return tpcorba.exo5.etudiantHelper.narrow(_this_object(orb));
	}
	public etudiantOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(etudiantOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		else
		{
			return super._default_POA();
		}
	}
	public java.lang.String prenom()
	{
		return _delegate.prenom();
	}

	public java.lang.String nom()
	{
		return _delegate.nom();
	}

}
