package vernon.ac.za.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;
import vernon.ac.za.App;
import vernon.ac.za.Domain.GameCategory;
import vernon.ac.za.Factories.GameCategoryFactory;
import vernon.ac.za.Repositories.GameCategoryRepository;

/**
 * Created by VERNON on 2016/08/27.
 */

@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class GameCategoryRepoTest extends AbstractTestNGSpringContextTests {

    private Long id;

    @Autowired
    GameCategoryRepository gameCategoryRepo;

    @Test
    public void create() throws Exception {
        GameCategory game = GameCategoryFactory.GameCategorySetup("Games of Wars","2013","Action");
        gameCategoryRepo.save(game);
        id = game.getId();
        Assert.assertNotNull(game.getId());
    }

    @Test(dependsOnMethods = "create")
    public void read() throws Exception {
        GameCategory game = gameCategoryRepo.findOne(id);
        Assert.assertNotNull(game.getId());
    }

    @Test(dependsOnMethods = "read")
    public void update() throws Exception {
        GameCategory game = gameCategoryRepo.findOne(id);

        GameCategory newgame = new GameCategory.Builder()
                .copy(game)
                .title("Watchdogs2")
                .year("2017")
                .category("Action")
                .build();

        gameCategoryRepo.save(newgame);
        GameCategory updatedGame = gameCategoryRepo.findOne(id);
        Assert.assertEquals(updatedGame.getId(), id);
    }
}
