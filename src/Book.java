public class Book implements Media {
    private String title;
    private String author;
    private String ISBN;
    private Boolean NSCCollection;

    /**
     * @param title Title of book
     * @param author Author of boon
     * @param ISBN ISBN code of the specific book
     * @param NSCCollection If in NSCCollection
     */
    Book(String title, String author, String ISBN, Boolean NSCCollection) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.NSCCollection = NSCCollection;
    }

    @Override
    public void Stringify() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(ISBN);
        System.out.println(NSCCollection);
    }
}
