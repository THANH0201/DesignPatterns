package visistor;

public interface FileSystemElement {
    void accept(FileSystemVisitor visitor);
}
