package orh.tnsif.uncheckedexception;

public class FinallyBlockNotExecotedExecutor {
	
	static void display(int arr[])
	{
		try
		{
			System.out.println(arr[2]);
			/*if try and catch block contains a system.exit(0);
			after the exception code line, then finally block
			does not execute*/
            System.exit(0);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception handled:"+e);
			System.exit(0);
		}
		finally
		{
			/*when finally block contains an exception cose, then
			 * finally block does not execute*/
			System.out.println(13/0);
			System.out.println("Finally block is always executed");
		}
		
	}
	
	public static void main(String[] args) {
		int arr[]= {11,6,89};
		display(arr);

	}

}
