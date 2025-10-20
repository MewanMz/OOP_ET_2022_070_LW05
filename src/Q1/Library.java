package Q1;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> BorrowableItemsList = new ArrayList<>();

    public void addLibraryItem(Book borrowableItem){
        BorrowableItemsList.add(borrowableItem);
    }

    public void checkOutBorrowableItem(String title){
        for (Book book:BorrowableItemsList ){
           if (book.getTitle().equals(title) && book.isAvailable()){
               System.out.println("The book you searched is available.");
               System.out.println("Checking out "+book.getTitle());
               book.setAvailable(false);
           }

        }

    }

    public void listAvailableItems(){
        System.out.println("Available books: ");
        for (Book book:BorrowableItemsList){
            if (book.isAvailable()){
                System.out.println(book.getTitle());
            }
        }
    }

    public void displayLibraryInfo(){
        int bookCount = 0;
        for (Book book:BorrowableItemsList){
            if (book.isAvailable()){
                bookCount++;
            }
        }
        System.out.println("Number of books available: "+bookCount);

    }
}
