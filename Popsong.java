
public class PopSong extends Song {
    
    // Constructor
    public PopSong(String title, String artist, int duration) {
        super(title, artist, duration);
    }
    @Override
    public void play() {
        System.out.println("Playing pop song: " + getTitle() + " by " + getArtist());
    }
}
