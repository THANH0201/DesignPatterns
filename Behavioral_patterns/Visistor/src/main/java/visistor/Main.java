package visistor;

public class Main {
    public static void main(String[] args) {
        // create directory
        Directory root = new Directory("root");
        root.add(new File("notes.txt", 10));
        root.add(new File("image1.png", 20));

        Directory doc = new Directory("doc");
        doc.add(new File("doc.txt", 25));
        doc.add(new File("report.pdf", 30));

        root.add(doc);

        // visit size
        SizeCalculatorVisitor sizeVisitor = new SizeCalculatorVisitor();
        root.accept(sizeVisitor);
        System.out.println("Total size: " + sizeVisitor.getTotal());

        // visit search
        SearchVisitor searchVisitor = new SearchVisitor(".txt");
        root.accept(searchVisitor);
        System.out.println("Matching files:");
        for (File f : searchVisitor.getMatches()) {
            System.out.println(f.getFilename());
        }
    }
}
