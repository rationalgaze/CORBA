package tpcorba.exo6;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "usine"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public class usinePOATie
	extends usinePOA
{
	private usineOperations _delegate;

	private POA _poa;
	public usinePOATie(usineOperations delegate)
	{
		_delegate = delegate;
	}
	public usinePOATie(usineOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public tpcorba.exo6.usine _this()
	{
		return tpcorba.exo6.usineHelper.narrow(_this_object());
	}
	public tpcorba.exo6.usine _this(org.omg.CORBA.ORB orb)
	{
		return tpcorba.exo6.usineHelper.narrow(_this_object(orb));
	}
	public usineOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(usineOperations delegate)
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
	public tpcorba.exo6.etudiant inscription_d_un_etudiant(java.lang.String nom, java.lang.String prenom)
	{
		return _delegate.inscription_d_un_etudiant(nom,prenom);
	}

}
