public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        Stereo stereo = new Stereo();
        Light light = new Light();

        Command turnTVOn = new TurnTVOn(tv);
        Command setStereoVolume = new SetStereoVolume(stereo, 10);
        Command dimLights = new DimLights(light, 50);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, turnTVOn);
        remoteControl.setCommand(1, setStereoVolume);
        remoteControl.setCommand(2, dimLights);

        System.out.println("Pressing button 0 (Turn TV On):");
        remoteControl.pressButton(0);

        System.out.println("\nPressing button 1 (Set Stereo Volume):");
        remoteControl.pressButton(1);

        System.out.println("\nPressing button 2 (Dim Lights):");
        remoteControl.pressButton(2);

        System.out.println("\nPressing undo button:");
        remoteControl.pressUndo();

        System.out.println("\nPressing undo button again:");
        remoteControl.pressUndo();
    }
}
