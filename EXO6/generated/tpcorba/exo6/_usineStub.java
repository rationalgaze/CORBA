package tpcorba.exo6;


/**
 *	Generated from IDL interface "usine"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public class _usineStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements tpcorba.exo6.usine
{
	private String[] ids = {"IDL:tpcorba/exo6/usine:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = tpcorba.exo6.usineOperations.class;
	public tpcorba.exo6.etudiant inscription_d_un_etudiant(java.lang.String nom, java.lang.String prenom)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "inscription_d_un_etudiant", true);
				_os.write_string(nom);
				_os.write_string(prenom);
				_is = _invoke(_os);
				tpcorba.exo6.etudiant _result = tpcorba.exo6.etudiantHelper.read(_is);
				return _result;
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "inscription_d_un_etudiant", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			usineOperations _localServant = (usineOperations)_so.servant;
			tpcorba.exo6.etudiant _result;			try
			{
			_result = _localServant.inscription_d_un_etudiant(nom,prenom);
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
