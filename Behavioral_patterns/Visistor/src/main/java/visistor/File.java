package visistor;

public class File implements FileSystemElement {
    private final String filename;
    private final int size;
    public File(String filename, int size) {
        this.filename = filename;
        this.size = size;
    }
    public String getFilename() {
        return filename;
    }
    public int getSize() {
        return size;
    }
    @Override
    public void accept(FileSystemVisitor visistor) {
        visistor.visit(this);
    }
}
