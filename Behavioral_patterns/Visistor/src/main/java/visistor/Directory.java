package visistor;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemElement{
    private final String folderName;
    private final List<FileSystemElement> files =  new ArrayList<>();
    public Directory(String folderName) {
        this.folderName = folderName;
    }
    public List<FileSystemElement> getFiles() {
        return files;
    }
    public void add(FileSystemElement file) {
        files.add(file);
    }
    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }
}
