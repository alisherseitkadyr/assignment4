import java.util.ArrayList;
import java.util.List;

// VersionControl Class (Caretaker)
public class VersionControl {
    private final List<DocumentVersion> versions = new ArrayList<>();

    public void saveVersion(Document document) {
        DocumentVersion version = document.createMemento();
        versions.add(version);
        System.out.println("Version saved.");
    }

    public void listVersions() {
        System.out.println("Available versions: " + versions.size());
        for (int i = 0; i < versions.size(); i++) {
            System.out.println("Version " + (i + 1) + ": " + versions.get(i).getContent());
        }
    }

    public void restoreVersion(Document document, int index) {
        if (index >= 0 && index < versions.size()) {
            document.restoreFromMemento(versions.get(index));
        } else {
            System.out.println("Invalid version index.");
        }
    }
}
