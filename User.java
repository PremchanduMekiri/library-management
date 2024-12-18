import java.util.ArrayList;

public class User  {
    private String name;
    private ArrayList<Book> Borrowedbooks;
    private int limit;

    public User(String name,int limit) {
        this.name = name;
        this.Borrowedbooks=new ArrayList<Book>();
        this.limit=limit;

    }
    public int getLimit(){
        return limit;
    }

    public String getname(){
        return name;
    }
    public void borrowedbooks(Book book){

        if(Borrowedbooks.size()>=limit){
            System.out.println("you can only borrow up to " +limit+" books");
            return;
        }
        Borrowedbooks.add(book);
        System.out.println(name+" borrowed the bookm "+book.getBook());
    }
    public void returnedbooks(String bookname) {
        for (Book book : Borrowedbooks) {
            if (book.getBook().equalsIgnoreCase(bookname)) {
                Borrowedbooks.remove(book);
                System.out.println("Book returned : " + bookname);
                return;
            }
        }
        System.out.println("Book not found in your borrowed list.");
    }


    public void Display_Info(){
        if(Borrowedbooks.isEmpty()){
            System.out.println("No books borrowed");
        }
        else {
            System.out.println(" The Books borrowed ");
            for(Book book:Borrowedbooks){
                System.out.println(book.getBook());
            }
        }


    }

}
