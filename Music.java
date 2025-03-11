/**
 * Java class to hold information associated with a music
 *
 * @version 2022-07-25
 * @author Purdue CS
 */
public class Music {

    /**
     * Name of the song
     */
    private String track;

    /**
     * Name of the artist
     */
    private String artist;

    /**
     *  Genre of the song
     */
    private String genre;

    /**
     * beatsPerMinute value
     */
    private int beatsPerMinute;

    /**
     * Number of time the song was recommended
     */
    private int popularity;

    /**
     * Create a newly allocated Music object based on the parameters provided
     * @param track track name
     * @param artist artist name
     * @param genre genre
     * @param beatsPerMinute beatsPerMinute value
     * @param popularity Number of time the song was recommended
     */
    public Music(String track, String artist, String genre, int beatsPerMinute, int popularity) {
        this.track = track;
        this.artist = artist;
        this.genre = genre;
        this.beatsPerMinute = beatsPerMinute;
        this.popularity = popularity;
    }

    /**
     * @return {@link #track} field
     */
    public String getTrack() {
        return track;
    }

    /**
     * @param track The value of the {@link #track} to be set
     */
    public void setTrack(String track) {
        this.track = track;
    }

    /**
     * @return {@link #artist} field
     */
    public String getArtist() {
        return artist;
    }

    /**
     * @param artist The value of the {@link #artist} field to be set
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }


    /**
     * @return {@link #genre} field
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre The value of the {@link #genre} field to be set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * @return {@link #beatsPerMinute} field
     */
    public int getBeatsPerMinute() {
        return beatsPerMinute;
    }

    /**
     * @param beatsPerMinute The value of the {@link #beatsPerMinute} field to be set
     */
    public void setBeatsPerMinute(int beatsPerMinute) {
        this.beatsPerMinute = beatsPerMinute;
    }

    /**
     * @return {@link #popularity} field
     */
    public int getPopularity() {
        return popularity;
    }

    /**
     * @param popularity The value of the {@link #popularity} field to be set
     */
    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    /**
     * Return a formatted String of the Music object
     * <br>
     * e.g. {@code "As It Was by Harry Styles: Pop music with 174 beatsPerMinute. Recommended 32 times."}
     *
     * @return Formatted string of the Music object
     */
    @Override
    public String toString() {
        return String.format("%s by %s: %s music with %d beatsPerMinute. Recommended %d times.",
                this.track, this.artist, this.genre, this.beatsPerMinute, this.popularity);
    }
}

