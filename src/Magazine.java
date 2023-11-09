public class Magazine implements Media {
    private String title;
    private int issueNumber;
    private String month;
    private Boolean NSCCollection;

    /**
     * @param title Title of the magazine
     * @param issueNumber Issue of the magazine
     * @param month Which month the magazine came out in
     * @param NSCCollection If in NSCCollection
     */
    Magazine(String title, int issueNumber, String month, Boolean NSCCollection) {
        this.title = title;
        this.issueNumber = issueNumber;
        this.month = month;
        this.NSCCollection = NSCCollection;
    }

    @Override
    public void Stringify() {
        System.out.println(title);
        System.out.println(issueNumber);
        System.out.println(month);
        System.out.println(NSCCollection);
    }
}
