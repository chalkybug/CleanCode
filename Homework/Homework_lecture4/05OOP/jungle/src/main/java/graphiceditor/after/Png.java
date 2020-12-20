package graphiceditor.after;

public class Png implements IFile {
  public final String EXTENSION = "png";
  private String fileOpenned;

  public void setFileOpenned(String fileOpenned) {
    this.fileOpenned = fileOpenned;
  }

  public String getFileOpenned() {
    return fileOpenned;
  }

  public String getExtension() {
    return EXTENSION;
  }

  @Override
  public void openFile(String fileName) {
    setFileOpenned(fileName);
    System.out.println(EXTENSION + ":  get " + fileName);

  }

  @Override
  public void parseFile() {
    System.out.println(EXTENSION + ": read");

  }

  @Override
  public void saveFile() {
    if (fileOpenned != null) {
      System.out.println(EXTENSION + ":  save");
    } else {
      System.out.println("Nothing to save");
    }

  }
}
