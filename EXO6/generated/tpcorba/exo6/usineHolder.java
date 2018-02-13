package tpcorba.exo6;

/**
 *	Generated from IDL interface "usine"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public final class usineHolder	implements org.omg.CORBA.portable.Streamable{
	 public usine value;
	public usineHolder()
	{
	}
	public usineHolder (final usine initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return usineHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = usineHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		usineHelper.write (_out,value);
	}
}
