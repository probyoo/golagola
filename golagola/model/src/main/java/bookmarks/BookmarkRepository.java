package bookmarks;


import java.util.Collection;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookmarkRepository extends MongoRepository<Bookmark, String> {
    Collection<Bookmark> findByAccountUsername(String username);
}