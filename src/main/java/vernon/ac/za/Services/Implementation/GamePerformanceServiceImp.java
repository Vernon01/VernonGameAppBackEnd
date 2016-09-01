package vernon.ac.za.Services.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vernon.ac.za.Domain.GamePerformanceToPrice;
import vernon.ac.za.Repositories.GamePerformanceRepository;
import vernon.ac.za.Services.GamePerformanceService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by VERNON on 2016/08/27.
 */

@Service
public class GamePerformanceServiceImp implements GamePerformanceService{

    @Autowired
    GamePerformanceRepository repo;

    @Override
    public GamePerformanceToPrice create(GamePerformanceToPrice entity)
    {
        return repo.save(entity);
    }

    @Override
    public GamePerformanceToPrice readById(Long id) {
        return repo.findOne(id);
    }

    @Override
    public List<GamePerformanceToPrice> findAll() {
        List<GamePerformanceToPrice> allGamePerformPrice = new ArrayList<>();
        Iterable<GamePerformanceToPrice> gamePerformPrice = repo.findAll();
        for (GamePerformanceToPrice customer : gamePerformPrice) {
            allGamePerformPrice.add(customer);
        }
        return allGamePerformPrice;
    }
    @Override
    public GamePerformanceToPrice update(GamePerformanceToPrice entity) {
        return repo.save(entity);
    }
    @Override
    public void delete(GamePerformanceToPrice entity) {
        repo.delete(entity);

    }
}
