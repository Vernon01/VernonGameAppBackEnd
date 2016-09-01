package vernon.ac.za.Services.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vernon.ac.za.Domain.GamePrices;
import vernon.ac.za.Repositories.GamePricesRepository;
import vernon.ac.za.Services.GamePricesService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by VERNON on 2016/08/27.
 */

@Service
public class GamePricesServiceImp implements GamePricesService{

    @Autowired
    GamePricesRepository repo;

    @Override
    public GamePrices create(GamePrices entity)
    {
        return repo.save(entity);
    }

    @Override
    public GamePrices readById(Long id) {
        return repo.findOne(id);
    }

    @Override
    public List<GamePrices> findAll() {
        List<GamePrices> allGamePrices = new ArrayList<>();
        Iterable<GamePrices> gamePrices = repo.findAll();
        for (GamePrices customer : gamePrices) {
            allGamePrices.add(customer);
        }
        return allGamePrices;
    }
    @Override
    public GamePrices update(GamePrices entity) {
        return repo.save(entity);
    }
    @Override
    public void delete(GamePrices entity) {
        repo.delete(entity);

    }
}
