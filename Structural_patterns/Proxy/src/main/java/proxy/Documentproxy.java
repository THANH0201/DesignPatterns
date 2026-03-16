package main.java.proxy;

import java.time.LocalDateTime;

public class Documentproxy implements InterfaceDocument{
    public String id;
    public LocalDateTime creationDate;
    private Document document;

    public Documentproxy(String id, LocalDateTime creationDate, Document document) {
        this.id = id;
        this.creationDate = creationDate;
        this.document = document;
    }

    @Override
    public String getIdentifier(){
        return id;
    }

    @Override
    public LocalDateTime getCreationDate(){
        return creationDate;
    }

    @Override
    public String getContent(User user) {
        AccessControllService acs = AccessControllService.getInstance();
        if (!acs.isAllowed(id,user.getUsername())) {
            throw new AccessDeniedException("User " + user.getUsername() + " is not allowed to access " + id);
        }
        return document.getContent(user);
    }

}
