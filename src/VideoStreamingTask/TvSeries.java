package VideoStreamingTask;

public class TvSeries extends Video{
    public int numOfEpisodes;
    public TvSeries(String name, int length, int numOfEpisodes) {
        super(name, length);
        this.numOfEpisodes = numOfEpisodes;
    }
    public int getNumOfEpisodes() {
        return numOfEpisodes;
    }
}
