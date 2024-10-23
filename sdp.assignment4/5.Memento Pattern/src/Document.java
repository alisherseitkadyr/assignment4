
public class Document {
    private String content;

    public Document() {
        this.content = "";
    }

    public void editContent(String newContent) {
        this.content = newContent;
        System.out.println("Document edited. Current content: " + this.content);
    }

    public DocumentVersion createMemento() {
        return new DocumentVersion(this.content);
    }

    public void restoreFromMemento(DocumentVersion memento) {
        this.content = memento.getContent();
        System.out.println("Document restored. Current content: " + this.content);
    }
}
