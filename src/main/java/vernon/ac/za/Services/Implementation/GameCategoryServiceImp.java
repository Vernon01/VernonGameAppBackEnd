package vernon.ac.za.Services.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vernon.ac.za.Domain.GameCategory;
import vernon.ac.za.Repositories.GameCategoryRepository;
import vernon.ac.za.Services.GameCategoryService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by VERNON on 2016/08/27.
 */

@Service
public class GameCategoryServiceImp implements GameCategoryService {

    @Autowired
    GameCategoryRepository repo;

    @Override
    public GameCategory create(GameCategory entity)
    {
        return repo.save(entity);
    }

    @Override
    public GameCategory readById(Long id) {
        return repo.findOne(id);
    }

    @Override
    public List<GameCategory> findAll() {
        List<GameCategory> allGameCategors = new ArrayList<>();
        Iterable<GameCategory> gameCategors = repo.findAll();
        for (GameCategory customer : gameCategors) {
            allGameCategors.add(customer);
        }
        return allGameCategors;
    }
    @Override
    public GameCategory update(GameCategory entity) {
        return repo.save(entity);
    }
    @Override
    public void delete(GameCategory entity) {
        repo.delete(entity);

    }
}
