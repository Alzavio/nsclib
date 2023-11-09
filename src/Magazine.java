public class Magazine implements Media {
    private String title;
    private int issueNumber;
    private String month;
    private Boolean NSCCollection;

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
