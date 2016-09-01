package vernon.ac.za.Services.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vernon.ac.za.Domain.GameComparing;
import vernon.ac.za.Repositories.GameComparingRepository;
import vernon.ac.za.Services.GameComparingService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by VERNON on 2016/08/27.
 */

@Service
public class GameComparingServiceImp implements GameComparingService{

    @Autowired
    GameComparingRepository repo;

    @Override
    public GameComparing create(GameComparing entity)
    {
        return repo.save(entity);
    }

    @Override
    public GameComparing readById(Long id) {
        return repo.findOne(id);
    }

    @Override
    public List<GameComparing> findAll() {
        List<GameComparing> allGameCompares = new ArrayList<>();
        Iterable<GameComparing> gameCompares = repo.findAll();
        for (GameComparing customer : gameCompares) {
            allGameCompares.add(customer);
        }
        return allGameCompares;
    }
    @Override
    public GameComparing update(GameComparing entity) {
        return repo.save(entity);
    }
    @Override
    public void delete(GameComparing entity) {
        repo.delete(entity);

    }
}
