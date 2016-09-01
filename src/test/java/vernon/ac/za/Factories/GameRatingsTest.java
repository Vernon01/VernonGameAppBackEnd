package vernon.ac.za.Factories;



import org.junit.Assert;
import org.junit.Test;
import vernon.ac.za.Domain.GameRatings;

/**
 * Created by VERNON on 2016/04/18.
 */
public class GameRatingsTest {

    private GameRatingsFactory factory;

    @Test
    public void testRoleCreation() throws Exception {
        GameRatings gt = factory.GameRatingsSetup("Games of Wars","2013","480",8);
        Assert.assertEquals(gt.getYear(),"2013");
        Assert.assertEquals(gt.getPrice(),"480");
        Assert.assertEquals(gt.getRating(),8);
    }


    @Test // can comment this test case out and it will show it works, both tests
    public void testRoleUpdate() throws Exception {
        GameRatings gt = factory.GameRatingsSetup("Games of Wars","2013","480",8);

        // Updated Description follows

        GameRatings updateGameTitles = new GameRatings.Builder("Games of Wars 2")
                .copy(gt)
                .year("2014")
                .build();

        Assert.assertEquals(updateGameTitles.getYear(),"2014");
        Assert.assertEquals(gt.getTitle(),updateGameTitles.getTitle());
        Assert.assertEquals(gt.getId(),updateGameTitles.getId());
    }
}
