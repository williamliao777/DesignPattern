package behavioral.memento.practice;

public class DocumentState {
    private final String content;
    private final String frontName;
    private final int fontSize;

    public DocumentState(String content, String frontName, int fontSize) {
        this.content = content;
        this.frontName = frontName;
        this.fontSize = fontSize;
    }

    public String getContent() {
        return content;
    }

    public String getFrontName() {
        return frontName;
    }

    public int getFontSize() {
        return fontSize;
    }
}
