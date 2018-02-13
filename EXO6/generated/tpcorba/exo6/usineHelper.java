package tpcorba.exo6;


/**
 *	Generated from IDL interface "usine"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public final class usineHelper
{
	public static void insert (final org.omg.CORBA.Any any, final tpcorba.exo6.usine s)
	{
			any.insert_Object(s);
	}
	public static tpcorba.exo6.usine extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:tpcorba/exo6/usine:1.0", "usine");
	}
	public static String id()
	{
		return "IDL:tpcorba/exo6/usine:1.0";
	}
	public static usine read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final tpcorba.exo6.usine s)
	{
		_out.write_Object(s);
	}
	public static tpcorba.exo6.usine narrow(final java.lang.Object obj)
	{
		if (obj instanceof tpcorba.exo6.usine)
		{
			return (tpcorba.exo6.usine)obj;
		}
		else if (obj instanceof org.omg.CORBA.Object)
		{
			return narrow((org.omg.CORBA.Object)obj);
		}
		throw new org.omg.CORBA.BAD_PARAM("Failed to narrow in helper");
	}
	public static tpcorba.exo6.usine narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (tpcorba.exo6.usine)obj;
		}
		catch (ClassCastException c)
		{
			if (obj._is_a("IDL:tpcorba/exo6/usine:1.0"))
			{
				tpcorba.exo6._usineStub stub;
				stub = new tpcorba.exo6._usineStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
	public static tpcorba.exo6.usine unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (tpcorba.exo6.usine)obj;
		}
		catch (ClassCastException c)
		{
				tpcorba.exo6._usineStub stub;
				stub = new tpcorba.exo6._usineStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
		}
	}
}
