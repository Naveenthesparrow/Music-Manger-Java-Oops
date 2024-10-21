import java.util.ArrayList;

public class Playlist {
    public static void main(String[] args) {
        ArrayList<Song> playlist = new ArrayList<>();

        playlist.add(new PopSong("Blinding Lights", "The Weeknd", 200));
        playlist.add(new RockSong("Bohemian Rhapsody", "Queen", 360));
        playlist.add(new PopSong("Levitating", "Dua Lipa", 203));
        playlist.add(new RockSong("Stairway to Heaven", "Led Zeppelin", 480));
        for (Song song : playlist) {
            song.play();
            song.showDetails();
            System.out.println();
        }
    }
}
