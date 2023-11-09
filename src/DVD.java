public class DVD implements Media {
    private String title;
    private int duration;
    private String genre;
    private Boolean NSCCollection;

    DVD(String title, int duration, String genre, Boolean NSCCollection) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.NSCCollection = NSCCollection;
    }

    @Override
    public void Stringify() {
        System.out.println(title);
        System.out.println(duration);
        System.out.println(genre);
        System.out.println(NSCCollection);
    }
}
