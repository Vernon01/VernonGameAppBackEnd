package vernon.ac.za.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vernon.ac.za.Domain.GameRatings;

/**
 * Created by VERNON on 2016/08/27.
 */

@Repository
public interface GameRatingsRepository extends CrudRepository<GameRatings, Long> {
}
