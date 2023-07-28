//program to demonstrate on access specifier
package in.bkc.met.library;

public class Library {
	//different access specifier
	public String libraryName;
	private long userId;
	String booksName;
	
	public void displayPublic()
	{
		System.out.println("Library Name:"+libraryName);
	}
    private void displayPrivate()
    {
    	System.out.println("User Id: "+userId);
     }
    void displayDefault()
    {
    	System.out.println("BooksName is: "+booksName);
    }
}
