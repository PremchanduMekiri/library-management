   public class Library_item {

        private String BookName;
        private String author;


        public Library_item(String BookName,String author){
            this.BookName=BookName;
            this.author=author;
        }

        public String getBook(){
            return BookName;
        }

        public String getauthor(){
            return author;
        }


}
