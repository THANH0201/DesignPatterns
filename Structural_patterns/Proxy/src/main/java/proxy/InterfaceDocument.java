package main.java.proxy;

import java.time.LocalDateTime;

public interface InterfaceDocument {
    String getContent(User user);
    String getIdentifier();
    LocalDateTime getCreationDate();


}
