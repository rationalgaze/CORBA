package tpcorba.exo5;

/**
 *	Generated from IDL interface "etudiant"
 *	@author JacORB IDL compiler V 2.2.2, 1-Jun-2005
 */

public final class etudiantHolder	implements org.omg.CORBA.portable.Streamable{
	 public etudiant value;
	public etudiantHolder()
	{
	}
	public etudiantHolder (final etudiant initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return etudiantHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = etudiantHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		etudiantHelper.write (_out,value);
	}
}
