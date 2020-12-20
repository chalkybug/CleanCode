package graphiceditor.after;

public class Jpg implements IFile {
  public final String EXTENSION = "jpg";
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
    System.out.println(EXTENSION + ":  openF " + fileName);

  }

  @Override
  public void parseFile() {
    System.out.println(EXTENSION + ": readF");

  }

  @Override
  public void saveFile() {
    if (fileOpenned != null) {
      System.out.println(EXTENSION + ":  saveF");
    } else {
      System.out.println("Nothing to save");
    }

  }
}
