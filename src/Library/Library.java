package Library;

public class Library {
    private Book[] books;

    Library(int quantityOfBooks) {
        books = new Book[quantityOfBooks];
    }

    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }

    public void showListOfAllBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }


    public void borrowBook(String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equals(title) && books[i].getAvailable() == true) {
                books[i].setAvailable(false);
                break;
            }
            else
                continue;
        }
    }

    public void giveBack(String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equals(title) && books[i].getAvailable() == false) {
                books[i].setAvailable(true);
                break;
            }
            else
                continue;
        }
    }

    public void showLoanBooks() {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAvailable() == false)
                System.out.println(books[i]);
            else
                continue;
        }
    }

    public void showAvailableBooks() {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAvailable() == true)
                System.out.println(books[i]);
            else
                continue;
        }
    }
}