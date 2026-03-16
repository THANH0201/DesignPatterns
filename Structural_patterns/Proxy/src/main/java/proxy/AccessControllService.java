package proxy;

import java.util.HashMap;
import java.util.HashSet;

public class AccessControllService {
    public static AccessControllService instance = new AccessControllService();
    private HashMap<String, HashSet<String>> permissions = new HashMap<>();

    private AccessControllService() {}
    public static AccessControllService getInstance(){
        return instance;

    }
    public void allow(String documentId, String username) {
        permissions.putIfAbsent(documentId, new HashSet<>());
        permissions.get(documentId).add(username);
    }

    public boolean isAllowed(String documentId, String username) {
        return permissions.containsKey(documentId)
                && permissions.get(documentId).contains(username);
    }
}
