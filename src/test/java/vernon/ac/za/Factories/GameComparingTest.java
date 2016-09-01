package vernon.ac.za.Factories;



import org.junit.Assert;
import org.junit.Test;
import vernon.ac.za.Domain.GameComparing;

/**
 * Created by VERNON on 2016/04/18.
 */
public class GameComparingTest {

    private GameComparingFactory factory;

    @Test
    public void testRoleCreation() throws Exception {
        GameComparing gt = factory.GameComparingSetup("Games of Wars","2013","Awesome war game");
        Assert.assertEquals(gt.getYear(),"Games of Wars");
        Assert.assertEquals(gt.getYear(),"2013");
        Assert.assertEquals(gt.getComment(),"Awesome war game");
    }


    @Test // can comment this test case out and it will show it works, both tests
    public void testRoleUpdate() throws Exception {
        GameComparing gt = factory.GameComparingSetup("Games of Wars","2013","Awesome war game");

        // Updated Description follows

        GameComparing updateGameTitles = new GameComparing.Builder()
                .copy(gt)
                .title("Games of Wars 2")
                .year("2014")
                .build();

        Assert.assertEquals(updateGameTitles.getYear(),"2014");
        Assert.assertEquals(gt.getTitle(),updateGameTitles.getTitle());
        Assert.assertEquals(gt.getId(),updateGameTitles.getId());
    }
}
