public class Book{
    private String BookName;
    private String author;
    public Book(String BookName,String author){
        this.BookName=BookName;
        this.author=author;
    }
    public String getBook(){
        return BookName;
    }
    public String getAuthor(){
        return author;
    }
}
