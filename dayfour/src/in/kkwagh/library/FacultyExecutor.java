//program to demonstrate on access specifier
//driver class
package in.kkwagh.library;
import in.bkc.met.library.Library;

public class FacultyExecutor {

	public static void main(String[] args) {
		Library obj=new Library();
		obj.libraryName="Bhujbal Library";
		obj.displayPublic();
		
		/*userId and displayPrivate() method is private, so
		 *we can't access into another package or class,only
		 *we can access inside the same class*/
		//obj.userId=123456L;
		//obj.displayPrivate();
		
		/*booksName and displayDefault() method is default,
		 *we can't access into another package, only we can access
		 *it within the same package*/
		//obj.booksName;
		//obj.displayDefault();
		
		

	}

}
