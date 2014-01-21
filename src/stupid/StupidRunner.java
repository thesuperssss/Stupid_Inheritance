package stupid;

public class StupidRunner
{
	public static void main(String arg[])
	{
		System.out.println("Lets look at inheritance!");

		Dumb harry = new Dumb(9);
		Dumber lloyd = new Dumber();

		System.out.println("harry is a dumb, his blerg is: " + harry.getBlerg());
		System.out.println("harry is a dumber, his blerg is: " + lloyd.getBlerg());

		lloyd.setBlerg(45);

		System.out.println("harry is a dumb, his blerg is: " + harry.getBlerg());
		System.out.println("harry is a dumber, his blerg is: " + lloyd.getBlerg());

	}
}
