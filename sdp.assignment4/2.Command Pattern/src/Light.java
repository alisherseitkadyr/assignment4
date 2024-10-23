public class Light {
    private int brightness;

    public void dim(int level) {
        brightness = level;
        System.out.println("Lights dimmed to " + brightness + "%");
    }

    public int getBrightness() {
        return brightness;
    }
}
