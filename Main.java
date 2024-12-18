import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Book> BookList = new ArrayList<>();

        BookList.add(new Book("Mahabharat", "Vadhavyasudu"));
        BookList.add(new Book("Ramayanam", "Valmiki"));
        BookList.add(new Book("Business tips", "NagarajU"));
        BookList.add(new Book("Land Lord", "Mallikram"));
        BookList.add(new Book("The King Mafia", "Anil"));
        BookList.add(new Book("Bagvathgitha", "Krishna"));

        ArrayList<User> StudentList = new ArrayList<>();

        StudentList.add(new User("Premchandu",5));
        StudentList.add(new User("Anil",5));
        StudentList.add(new User("Nagaraju",5));
        StudentList.add(new User("Rambabu",5));

        ArrayList<User> TeacherList = new ArrayList<>();

        TeacherList.add(new User("Ruksar",3));
        TeacherList.add(new User("Shobha",3));
        TeacherList.add(new User("umashankar",3));

        System.out.println("Available Books in the Library:");
        System.out.println();
        while (true) {
            System.out.println("Are u a student /teacher");
            System.out.println("1--for the student");
            System.out.println("2-for the teacher");
            System.out.println("3-exit");

            int choice = scn.nextInt();
            scn.nextLine();
            if (choice == 3) {
                System.out.println("exiting the task");
                break;
            }

            System.out.println("enter ur name");
            String user = scn.nextLine();
            User currentUser = null;
            if (choice == 1) {
                for (User student : StudentList) {
                    if (student.getname().equalsIgnoreCase(user)) {

                        currentUser = student;
                        break;
                    }
                }
            }
            else if(choice == 2){
                for (User teacher : TeacherList) {
                    if (teacher.getname().equalsIgnoreCase(user)) {
                        currentUser = teacher;
                        break;
                    }
                }
            }
            else {
                System.out.println(" invalid choice ! try again");
                continue;
            }
            if (currentUser == null) {
                System.out.println("User not found");
                continue;
            }

            while (true) {
                System.out.println("\n what would u like to do ? \n 1- BorrowBook \n2-returnbook\n 3-view borrowed books \n 4-go back");

                int action = scn.nextInt();
                scn.nextLine();

                if (action == 4) {
                    System.out.println("ur exited");
                    break;
                }
                switch (action) {
                    case 1:
                        System.out.println("available books in the library");
                        for (int i = 0; i < BookList.size(); i++) {
                            System.out.println((i + 1) + "  " + BookList.get(i).getBook()+" written by "+BookList.get(i).getAuthor());
                        }
                        System.out.println("enter the no of books you want to borrow :");
                        int bookIndex = scn.nextInt();

                        if (bookIndex >= 0 && bookIndex < BookList.size()) {
                            currentUser.borrowedbooks(BookList.get(bookIndex));
                        } else {
                            System.out.println("invalid selection");
                        }
                        break;

                    case 2:
                        System.out.println("enter the name of book that u want to return");
                        String booktoreturn = scn.nextLine();
                        currentUser.returnedbooks(booktoreturn);
                        break;

                    case 3:

                        currentUser.Display_Info();
                        break;

                    default:
                        System.out.println("invalid choice try again");

                }
            }
        }
    }
}