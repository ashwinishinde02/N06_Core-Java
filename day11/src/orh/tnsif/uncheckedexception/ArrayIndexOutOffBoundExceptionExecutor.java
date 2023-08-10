package orh.tnsif.uncheckedexception;

public class ArrayIndexOutOffBoundExceptionExecutor {

	
		
		static void display(int arr[])
		{
			try
			{
				System.out.println(arr[3]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Exception handled:"+e);
			}
			finally
			{
				System.out.println("Finally block is always executed");
			}
			
		}
		
		public static void main(String[] args) {
			int arr[]= {12,6,89};
			display(arr);

	}

}
