package tpcorba.exo5;


/**
 *	Generated from IDL interface "etudiant"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public class _etudiantStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements tpcorba.exo5.etudiant
{
	private String[] ids = {"IDL:tpcorba/exo5/etudiant:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = tpcorba.exo5.etudiantOperations.class;
	public java.lang.String prenom()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_prenom",true);
				_is = _invoke(_os);
				return _is.read_string();
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}

		else
		{
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_prenom", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			etudiantOperations _localServant = (etudiantOperations)_so.servant;
			java.lang.String _result;
		try
		{
			_result = _localServant.prenom();
		}
		finally
		{
			_servant_postinvoke(_so);
		}
		return _result;
		}
		}

	}

	public java.lang.String nom()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_nom",true);
				_is = _invoke(_os);
				return _is.read_string();
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}

		else
		{
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_nom", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			etudiantOperations _localServant = (etudiantOperations)_so.servant;
			java.lang.String _result;
		try
		{
			_result = _localServant.nom();
		}
		finally
		{
			_servant_postinvoke(_so);
		}
		return _result;
		}
		}

	}

}
