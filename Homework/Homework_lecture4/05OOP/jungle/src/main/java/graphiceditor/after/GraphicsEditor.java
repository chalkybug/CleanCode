package graphiceditor.after;

import java.util.ArrayList;

public class GraphicsEditor {
  private IFile bmp = new Bmp();
  private IFile gif = new Gif();
  private IFile png = new Png();
  private IFile jpg = new Jpg();
  private ArrayList<IFile> files = new ArrayList<IFile>();

  public void openFile(String fileName) throws Exception {
    String extension = fileName.substring(fileName.length() - 3);
    files.add(bmp);
    files.add(gif);
    files.add(png);
    files.add(jpg);

    for (IFile iFile : files) {
      if (iFile.getExtension().equals(extension)) {
        iFile.openFile(fileName);
      }
    }

  }
}
