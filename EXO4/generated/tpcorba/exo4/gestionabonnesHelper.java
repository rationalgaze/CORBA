package tpcorba.exo4;


/**
 *	Generated from IDL interface "gestionabonnes"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public final class gestionabonnesHelper
{
	public static void insert (final org.omg.CORBA.Any any, final tpcorba.exo4.gestionabonnes s)
	{
			any.insert_Object(s);
	}
	public static tpcorba.exo4.gestionabonnes extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:tpcorba/exo4/gestionabonnes:1.0", "gestionabonnes");
	}
	public static String id()
	{
		return "IDL:tpcorba/exo4/gestionabonnes:1.0";
	}
	public static gestionabonnes read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final tpcorba.exo4.gestionabonnes s)
	{
		_out.write_Object(s);
	}
	public static tpcorba.exo4.gestionabonnes narrow(final java.lang.Object obj)
	{
		if (obj instanceof tpcorba.exo4.gestionabonnes)
		{
			return (tpcorba.exo4.gestionabonnes)obj;
		}
		else if (obj instanceof org.omg.CORBA.Object)
		{
			return narrow((org.omg.CORBA.Object)obj);
		}
		throw new org.omg.CORBA.BAD_PARAM("Failed to narrow in helper");
	}
	public static tpcorba.exo4.gestionabonnes narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (tpcorba.exo4.gestionabonnes)obj;
		}
		catch (ClassCastException c)
		{
			if (obj._is_a("IDL:tpcorba/exo4/gestionabonnes:1.0"))
			{
				tpcorba.exo4._gestionabonnesStub stub;
				stub = new tpcorba.exo4._gestionabonnesStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
	public static tpcorba.exo4.gestionabonnes unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (tpcorba.exo4.gestionabonnes)obj;
		}
		catch (ClassCastException c)
		{
				tpcorba.exo4._gestionabonnesStub stub;
				stub = new tpcorba.exo4._gestionabonnesStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
		}
	}
}
