package visistor;

public class SizeCalculatorVisitor implements FileSystemVisitor {
    private int total = 0;

    public int getTotal(){
        return total;
    }

    @Override
    public void visit(File file) {
        total += file.getSize();
    }

    @Override
    public void visit(Directory directory) {
            for(FileSystemElement file : directory.getFiles()){
                file.accept(this);
            }
    }
}
