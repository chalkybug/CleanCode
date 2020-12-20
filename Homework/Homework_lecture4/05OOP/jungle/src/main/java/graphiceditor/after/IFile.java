package graphiceditor.after;

public interface IFile {
    public void openFile(String fileName);

    public void parseFile();

    public void saveFile();

    public String getExtension();

}
