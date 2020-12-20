package graphiceditor.after;

public class Gif implements IFile {
    public final String EXTENSION = "gif";
    private String fileOpenned;

    public String getExtension() {
        return EXTENSION;
    }

    @Override
    public void openFile(String fileName) {
        fileOpenned = fileName;
        System.out.println(EXTENSION + ":  open " + fileName);
    }

    @Override
    public void parseFile() {
        System.out.println(EXTENSION + ": read");
    }

    @Override
    public void saveFile() {
        if (fileOpenned != null) {
            System.out.println(EXTENSION + ":  persist");
        } else {
            System.out.println("Nothing to save");
        }

    }
}
