/**
 * Java class to hold information associated with the user's music preference
 *
 * @version 2022-07-25
 * @author Purdue CS
 */
public class MusicProfile {

    /**
     * Name of the user
     */
    private String name;

    /**
     * Preferred artist. User should be able to utilize the program correctly even if this does not match the
     * case or only contains part of the artist name.
     */
    private String preferredArtist;

    /**
     * Preferred genre.
     */
    private String preferredGenre;

    /**
     * Preferred beatsPerMinute value.
     */
    private int preferredBeatsPerMinute;

    /**
     * Whether the user likes popular song or not.
     */
    private boolean likePopular;

    /**
     * Create a newly allocated MusicProfile object based on the provided parameters
     *
     * @param name Name of the user
     * @param preferredArtist Preferred artist
     * @param preferredGenre Preferred genre
     * @param preferredBeatsPerMinute Preferred beatsPerMinute value
     * @param likePopular Whether the user likes popular song or not
     */
    public MusicProfile(String name, String preferredArtist, String preferredGenre, int preferredBeatsPerMinute,
                        boolean likePopular) {
        this.name = name;
        this.preferredArtist = preferredArtist;
        this.preferredGenre = preferredGenre;
        this.preferredBeatsPerMinute = preferredBeatsPerMinute;
        this.likePopular = likePopular;
    }

    /**
     * @return {@link #name} field
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The value of the {@link #name} field to be set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return {@link #preferredArtist} field
     */
    public String getPreferredArtist() {
        return preferredArtist;
    }

    /**
     * @param preferredArtist The value of the {@link #preferredArtist} field to be set
     */
    public void setPreferredArtist(String preferredArtist) {
        this.preferredArtist = preferredArtist;
    }

    /**
     * @return {@link #preferredGenre} field
     */
    public String getPreferredGenre() {
        return preferredGenre;
    }

    /**
     * @param preferredGenre The value of the {@link #preferredGenre} field to be set
     */
    public void setPreferredGenre(String preferredGenre) {
        this.preferredGenre = preferredGenre;
    }

    /**
     * @return {@link #preferredBeatsPerMinute}" field
     */
    public int getPreferredBeatsPerMinute() {
        return preferredBeatsPerMinute;
    }

    /**
     * @param preferredBeatsPerMinute The value of the {@link #preferredBeatsPerMinute} field to be set
     */
    public void setPreferredBeatsPerMinute(int preferredBeatsPerMinute) {
        this.preferredBeatsPerMinute = preferredBeatsPerMinute;
    }

    /**
     * @return {@link #likePopular} field
     */
    public boolean isLikePopular() {
        return likePopular;
    }

    /**
     * @param likePopular The value of the {@link #likePopular} field to be set
     */
    public void setLikePopular(boolean likePopular) {
        this.likePopular = likePopular;
    }

}

