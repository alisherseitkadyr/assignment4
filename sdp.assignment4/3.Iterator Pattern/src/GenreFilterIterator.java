import java.util.ArrayList;
import java.util.List;
public class GenreFilterIterator implements Iterator<Song> {
    private Playlist playlist;
    private List<Song> filteredSongs;
    private int index;

    public GenreFilterIterator(Playlist playlist, String genre) {
        this.playlist = playlist;
        this.filteredSongs = new ArrayList<>();
        for (Song song : playlist.getSongs()) {
            if (song.getGenre().equalsIgnoreCase(genre)) {
                filteredSongs.add(song);
            }
        }
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < filteredSongs.size();
    }

    @Override
    public Song next() {
        return filteredSongs.get(index++);
    }
}
