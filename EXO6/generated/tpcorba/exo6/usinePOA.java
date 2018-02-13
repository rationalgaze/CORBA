package tpcorba.exo6;

/**
 *	Generated from IDL interface "usine"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */


public abstract class usinePOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, tpcorba.exo6.usineOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "inscription_d_un_etudiant", new java.lang.Integer(0));
	}
	private String[] ids = {"IDL:tpcorba/exo6/usine:1.0"};
	public tpcorba.exo6.usine _this()
	{
		return tpcorba.exo6.usineHelper.narrow(_this_object());
	}
	public tpcorba.exo6.usine _this(org.omg.CORBA.ORB orb)
	{
		return tpcorba.exo6.usineHelper.narrow(_this_object(orb));
	}
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		org.omg.CORBA.portable.OutputStream _out = null;
		// do something
		// quick lookup of operation
		java.lang.Integer opsIndex = (java.lang.Integer)m_opsHash.get ( method );
		if ( null == opsIndex )
			throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
		switch ( opsIndex.intValue() )
		{
			case 0: // inscription_d_un_etudiant
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				tpcorba.exo6.etudiantHelper.write(_out,inscription_d_un_etudiant(_arg0,_arg1));
				break;
			}
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
