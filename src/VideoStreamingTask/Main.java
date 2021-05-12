package VideoStreamingTask;

public class Main {
    public static void main(String[] args) {
        Movie hardcoreHenry = new Movie("Hardcore Henry", 200);
        TvSeries scrubs = new TvSeries("Scrubs", 40, 169);
        System.out.println(scrubs.getNumOfEpisodes());
        System.out.println(hardcoreHenry.isHasSeen());
        hardcoreHenry.sawAndLiked(6);
        hardcoreHenry.sawAndLiked(5);
        System.out.println(hardcoreHenry.isHasSeen());
    }
}
