package proxy;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Library lib = new Library();
        AccessControllService acs = AccessControllService.getInstance();

        Document doc1 = new Document("doc1", LocalDateTime.now(), "Public content");
        lib.addUnProtectedDocument(doc1);

        Document doc2 = new Document("doc2", LocalDateTime.now(), "Secret content");
        lib.addProtectedDocument(doc2);

        acs.allow("doc2", "alice");

        User alice = new User("alice");
        User bob = new User("bob");

        System.out.println(lib.get("doc1").getContent(alice));

        System.out.println(lib.get("doc2").getContent(alice));
        System.out.println(lib.get("doc2").getContent(bob));
    }
}
