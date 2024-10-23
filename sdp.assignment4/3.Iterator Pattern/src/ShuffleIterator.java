import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
public class ShuffleIterator implements Iterator<Song> {
    private List<Song> shuffledSongs;
    private int index;

    public ShuffleIterator(Playlist playlist) {
        shuffledSongs = new ArrayList<>(playlist.getSongs());
        Collections.shuffle(shuffledSongs, new Random());
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < shuffledSongs.size();
    }

    @Override
    public Song next() {
        return shuffledSongs.get(index++);
    }
}
