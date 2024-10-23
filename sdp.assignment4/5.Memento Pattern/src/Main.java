public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        VersionControl versionControl = new VersionControl();

        document.editContent("Version 1: Initial content.");
        versionControl.saveVersion(document);

        document.editContent("Version 2: Added more content.");
        versionControl.saveVersion(document);

        document.editContent("Version 3: Final content.");
        versionControl.saveVersion(document);

        versionControl.listVersions();

        versionControl.restoreVersion(document, 1);
        versionControl.listVersions();

        versionControl.restoreVersion(document, 5);
    }
}
