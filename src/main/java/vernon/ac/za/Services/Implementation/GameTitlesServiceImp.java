package vernon.ac.za.Services.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vernon.ac.za.Domain.GameTitles;
import vernon.ac.za.Repositories.GameTitlesRepository;
import vernon.ac.za.Services.GameTitlesService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by VERNON on 2016/08/27.
 */

@Service
public class GameTitlesServiceImp implements GameTitlesService{

    @Autowired
    GameTitlesRepository repo;

    @Override
    public GameTitles create(GameTitles entity)
    {
        return repo.save(entity);
    }

    @Override
    public GameTitles readById(Long id) {
        return repo.findOne(id);
    }

    @Override
    public List<GameTitles> findAll() {
        List<GameTitles> allGameTitles = new ArrayList<>();
        Iterable<GameTitles> gameTitles = repo.findAll();
        for (GameTitles customer : gameTitles) {
            allGameTitles.add(customer);
        }
        return allGameTitles;
    }
    @Override
    public GameTitles update(GameTitles entity) {
        return repo.save(entity);
    }
    @Override
    public void delete(GameTitles entity) {
        repo.delete(entity);

    }
}
