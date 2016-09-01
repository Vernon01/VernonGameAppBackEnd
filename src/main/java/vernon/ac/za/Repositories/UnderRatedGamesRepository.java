package vernon.ac.za.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vernon.ac.za.Domain.UnderRatedGames;

/**
 * Created by VERNON on 2016/08/27.
 */

@Repository
public interface UnderRatedGamesRepository extends CrudRepository<UnderRatedGames, Long> {
}
