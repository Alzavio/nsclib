public class NSCLibraryTest {
    public static void main(String[] args) {
        // Book Objects
        Book book1 = new Book("The Final Empire", "Brandon Sanderson", "1234567", true);
        Book book2 = new Book("The Well of Ascension", "Brandon Sanderson", "1234567", false);

        // DVD Objects
        DVD dvd1 = new DVD("test1", 2,"test",  false);
        DVD dvd2 = new DVD("test2", 2,"test",  false);
        DVD dvd3 = new DVD("test3", 2,"test",  false);

        // Magazine Objects
        Magazine magazine1 = new Magazine("Time", 567, "1234567", true);
        Magazine magazine2 = new Magazine("Time", 568, "1234567", true);
        Magazine magazine3 = new Magazine("Time", 527, "1234567", true);
        Magazine magazine4 = new Magazine("National Geographic", 57, "1234567", true);

        // Add books to NSC Library
        NSCLibraryMediaContainer<Book> bookContainer = new NSCLibraryMediaContainer<Book>();
        bookContainer.add(book1);
        bookContainer.add(book2);

        // Remove one of the books and test the contents
        bookContainer.remove(book1);
        bookContainer.display();

        // Add DVDs to NSC Library
        NSCLibraryMediaContainer<DVD> dvdContainer = new NSCLibraryMediaContainer<DVD>();
        dvdContainer.add(dvd1);
        dvdContainer.add(dvd2);
        dvdContainer.add(dvd3);

        // Add magazines to NSC Library
        NSCLibraryMediaContainer<Magazine> magazineContainer = new NSCLibraryMediaContainer<Magazine>();
        magazineContainer.add(magazine1);
        magazineContainer.add(magazine2);
        magazineContainer.add(magazine3);
        magazineContainer.add(magazine4);


        // Print details of the different objects
        NSCMediaUtils mediaDetail = new NSCMediaUtils();
        System.out.println();
        mediaDetail.printMediaDetails(book1);
        System.out.println();
        mediaDetail.printMediaDetails(dvd1);
        System.out.println();
        mediaDetail.printMediaDetails(magazine1);
    }
}
