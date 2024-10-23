public class SetStereoVolume implements Command {
    private Stereo stereo;
    private int previousVolume;
    private int volume;

    public SetStereoVolume(Stereo stereo, int volume) {
        this.stereo = stereo;
        this.volume = volume;
    }

    @Override
    public void execute() {
        previousVolume = stereo.getVolume();
        stereo.setVolume(volume);
    }

    @Override
    public void undo() {
        stereo.setVolume(previousVolume);
    }
}
