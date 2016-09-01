package vernon.ac.za.Services.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vernon.ac.za.Domain.GameRatings;
import vernon.ac.za.Repositories.GameRatingsRepository;
import vernon.ac.za.Services.GameRatingsService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by VERNON on 2016/08/27.
 */

@Service
public class GameRatingsServiceImp implements GameRatingsService{

    @Autowired
    GameRatingsRepository repo;

    @Override
    public GameRatings create(GameRatings entity)
    {
        return repo.save(entity);
    }

    @Override
    public GameRatings readById(Long id) {
        return repo.findOne(id);
    }

    @Override
    public List<GameRatings> findAll() {
        List<GameRatings> allGameRatings = new ArrayList<>();
        Iterable<GameRatings> gameRatings = repo.findAll();
        for (GameRatings customer : gameRatings) {
            allGameRatings.add(customer);
        }
        return allGameRatings;
    }
    @Override
    public GameRatings update(GameRatings entity) {
        return repo.save(entity);
    }
    @Override
    public void delete(GameRatings entity) {
        repo.delete(entity);

    }
}
