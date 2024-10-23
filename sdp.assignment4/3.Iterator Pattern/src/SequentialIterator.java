public class SequentialIterator implements Iterator<Song> {
    private Playlist playlist;
    private int index;

    public SequentialIterator(Playlist playlist) {
        this.playlist = playlist;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < playlist.getSongs().size();
    }

    @Override
    public Song next() {
        return playlist.getSongs().get(index++);
    }
}
