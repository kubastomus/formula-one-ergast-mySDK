package pl.kubastomus.formula.ergast.objects;

public class Season {

    private int season;
    private String url;

    public Season(String season, String url) {
        this.season = Integer.valueOf(season);
        this.url = url;
    }

    public int getSeason() {
        return season;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "Season{" +
                "season=" + season +
                ", url='" + url + '\'' +
                '}';
    }
}
