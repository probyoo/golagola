package bookmarks;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;


public class Account {

    private Set<Bookmark> bookmarks = new HashSet<>();

    @Id
    private String id;

    public Set<Bookmark> getBookmarks() {
        return bookmarks;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    @JsonIgnore
    public String password;
    public String username;

    public Account(String name, String password) {
        this.username = name;
        this.password = password;
    }

    Account() { // jpa only
    }
}