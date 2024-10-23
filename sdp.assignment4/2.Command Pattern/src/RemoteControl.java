public class RemoteControl {
    private Command[] onCommands;
    private Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[5];
    }

    public void setCommand(int slot, Command command) {
        if (slot < onCommands.length) {
            onCommands[slot] = command;
        }
    }

    public void pressButton(int slot) {
        if (slot < onCommands.length && onCommands[slot] != null) {
            onCommands[slot].execute();
            undoCommand = onCommands[slot];
        }
    }

    public void pressUndo() {
        if (undoCommand != null) {
            undoCommand.undo();
        }
    }
}
