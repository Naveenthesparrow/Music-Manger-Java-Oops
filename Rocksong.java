
public class RockSong extends Song {
    public RockSong(String title, String artist, int duration) {
        super(title, artist, duration);
    }
    @Override
    public void play() {
        System.out.println("Playing rock song: " + getTitle() + " by " + getArtist());
    }
}
