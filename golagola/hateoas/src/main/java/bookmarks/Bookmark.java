package bookmarks;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Bookmark {

    @JsonIgnore
    private Account account;

    @Id
    private String id;

    Bookmark() { // jpa only
    }

    public Bookmark(Account account, String uri, String description) {
        this.uri = uri;
        this.description = description;
        this.account = account;
    }

    public String uri;
    public String description;

    public Account getAccount() {
        return account;
    }

    public String getId() {
        return id;
    }

    public String getUri() {
        return uri;
    }

    public String getDescription() {
        return description;
    }
}