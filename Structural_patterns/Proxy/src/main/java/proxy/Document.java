package proxy;

import java.time.LocalDateTime;

public class Document implements InterfaceDocument {
    public String id;
    public LocalDateTime creationDate;
    private String content;

    public Document(String id, LocalDateTime creationDate, String content) {
        this.id = id;
        this.creationDate = creationDate;
        this.content = content;
    }

    @Override
    public String getIdentifier() {
        return id;
    }

    @Override
    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    @Override
    public String getContent(User user) {
        return content;
    }
}
