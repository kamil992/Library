package Library;

public class Main
{
    public static void main(String[] args) {

        Library library = new Library(5);
        library.addBook(new Book("Java","A.P.Horstmann",999,false));
        library.addBook(new Book("Spring in Action","Bolesław Chrobry",888,false));
        library.addBook(new Book("Html & Css","Władysław Lokietek",500,true));
        library.addBook(new Book("JavaScript from Zero to Zero","Pan Alojzy",100,true));
        library.addBook(new Book("Java","A.P.Horstmann",999,true));

        library.showListOfAllBooks();
        System.out.println();

        library.borrowBook("Java");
        library.giveBack("Spring in Action");
        library.borrowBook("JavaScript from Zero to Zero");
        library.showListOfAllBooks();


        System.out.println();
        library.showLoanBooks();
        System.out.println();
        library.showAvailableBooks();


    }
}
