//program to demonstrate on Arthmetic exception
package orh.tnsif.uncheckedexception;
import java.util.Scanner;
public class ArthemeticExecutorException {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int x=s.nextInt();
	int y=s.nextInt();
	//try block contain an exception code
	try
	{
		System.out.println(x/y);
	}
	//catch block is used to handled exception
    catch(Exception e)
	{
    	System.out.println("Exception handled:"+e);
	}
	}

}
