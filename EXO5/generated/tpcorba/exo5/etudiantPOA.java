package tpcorba.exo5;

/**
 *	Generated from IDL interface "etudiant"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */


public abstract class etudiantPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, tpcorba.exo5.etudiantOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "_get_prenom", new java.lang.Integer(0));
		m_opsHash.put ( "_get_nom", new java.lang.Integer(1));
	}
	private String[] ids = {"IDL:tpcorba/exo5/etudiant:1.0"};
	public tpcorba.exo5.etudiant _this()
	{
		return tpcorba.exo5.etudiantHelper.narrow(_this_object());
	}
	public tpcorba.exo5.etudiant _this(org.omg.CORBA.ORB orb)
	{
		return tpcorba.exo5.etudiantHelper.narrow(_this_object(orb));
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
			case 0: // _get_prenom
			{
			_out = handler.createReply();
			_out.write_string(prenom());
				break;
			}
			case 1: // _get_nom
			{
			_out = handler.createReply();
			_out.write_string(nom());
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
