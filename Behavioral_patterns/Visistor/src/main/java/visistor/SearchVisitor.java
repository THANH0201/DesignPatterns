package visistor;

import java.util.ArrayList;
import java.util.List;

public class SearchVisitor implements FileSystemVisitor {
    private String condition;
    private final List<File> matches = new ArrayList<>();

    public List<File> getMatches() {
        return matches;
    }
    public SearchVisitor(String condition) {
        this.condition = condition;
    }

    @Override
    public void visit(File file) {
        if(file.getFilename().endsWith(condition)) {
            matches.add(file);
        }
    }
    @Override
    public void visit(Directory directory) {
        for(FileSystemElement file : directory.getFiles()){
            file.accept(this);
        }
    }
}
