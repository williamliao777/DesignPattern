package behavioral.memento.practice;

public class Document {
  private String content;
  private String frontName;
  private int fontSize;

  public DocumentState createState() {
    return new DocumentState(content, frontName, fontSize);
  }

  public void restore(DocumentState documentState) {
    content = documentState.getContent();
    frontName = documentState.getFrontName();
    fontSize = documentState.getFontSize();
  }

  public void setContent(String content) {
    this.content = content;
  }

  public void setFrontName(String frontName) {
    this.frontName = frontName;
  }

  public void setFontSize(int fontSize) {
    this.fontSize = fontSize;
  }

  @Override
  public String toString() {
    return "Document{" +
            "content='" + content + '\'' +
            ", fontName='" + frontName + '\'' +
            ", fontSize=" + fontSize +
            '}';
  }
}
