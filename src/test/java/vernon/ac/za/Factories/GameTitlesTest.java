package vernon.ac.za.Factories;



import org.junit.Assert;
import org.junit.Test;
import vernon.ac.za.Domain.GameTitles;

/**
 * Created by VERNON on 2016/04/18.
 */
public class GameTitlesTest {

    private GameTitlesFactory factory;

    @Test
    public void testRoleCreation() throws Exception {
        GameTitles gt = factory.GameTitlesSetup("Games of Wars","2013","Playstation2");
        Assert.assertEquals(gt.getYear(),"2013");
        Assert.assertEquals(gt.getMachine(),"PlayStation2");
    }


    @Test // can comment this test case out and it will show it works, both tests
    public void testRoleUpdate() throws Exception {
        GameTitles gt = factory.GameTitlesSetup("Games of Wars","2013","Playstation2");

        // Updated Description follows

        GameTitles updateGameTitles = new GameTitles.Builder("Games of Wars 2")
                .copy(gt)
                .year("2014")
                .build();

        Assert.assertEquals(updateGameTitles.getYear(),"2014");
        Assert.assertEquals(gt.getTitle(),updateGameTitles.getTitle());
        Assert.assertEquals(gt.getId(),updateGameTitles.getId());
    }
}
