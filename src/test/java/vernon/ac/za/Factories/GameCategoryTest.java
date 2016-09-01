package vernon.ac.za.Factories;



import org.junit.Assert;
import org.junit.Test;
import vernon.ac.za.Domain.GameCategory;

/**
 * Created by VERNON on 2016/04/18.
 */
public class GameCategoryTest {

    private GameCategoryFactory factory;

    @Test
    public void testRoleCreation() throws Exception {
        GameCategory gt = factory.GameCategorySetup("Games of Wars","2013","Action");
        Assert.assertEquals(gt.getYear(),"Games of Wars");
        Assert.assertEquals(gt.getYear(),"2013");
        Assert.assertEquals(gt.getCategory(),"Action");
    }


    @Test // can comment this test case out and it will show it works, both tests
    public void testRoleUpdate() throws Exception {
        GameCategory gt = factory.GameCategorySetup("Games of Wars","2013","Action");

        // Updated Description follows

        GameCategory updateGameTitles = new GameCategory.Builder()
                .copy(gt)
                .title("Games of Wars 2")
                .year("2014")
                .build();

        Assert.assertEquals(updateGameTitles.getYear(),"2014");
        Assert.assertEquals(gt.getTitle(),updateGameTitles.getTitle());
        Assert.assertEquals(gt.getId(),updateGameTitles.getId());
    }
}
