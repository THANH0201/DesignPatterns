package main.java.proxy;

import java.util.HashMap;

public class Library {
    private final HashMap<String, InterfaceDocument> documents = new HashMap<>();
    public void addUnProtectedDocument(Document document) {
        documents.put(document.getIdentifier(), document);
    }

    public void addProtectedDocument(Document document) {
        Documentproxy documentproxy = new Documentproxy(document.getIdentifier(), document.getCreationDate(), document);
        documents.put(document.getIdentifier(), documentproxy);
    }
    public InterfaceDocument get(String id) {
        return documents.get(id);
    }
}
