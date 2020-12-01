package dk.sb.userrating;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Collection;

public interface RatingRepository extends MongoRepository<Rating, String> {
    Collection<Rating> findAllByCar(int id);
    Collection<Rating> findAllByUser(User user);
}
