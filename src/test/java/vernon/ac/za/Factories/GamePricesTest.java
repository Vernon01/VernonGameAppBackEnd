package vernon.ac.za.Factories;



import org.junit.Assert;
import org.junit.Test;
import vernon.ac.za.Domain.GamePrices;

/**
 * Created by VERNON on 2016/04/18.
 */
public class GamePricesTest {

    private GamePricesFactory factory;

    @Test
    public void testRoleCreation() throws Exception {
        GamePrices gt = factory.GamePricesSetup("Games of Wars","2013","480","xbox");
        Assert.assertEquals(gt.getYear(),"2013");
        Assert.assertEquals(gt.getPrice(),"480");
    }


    @Test // can comment this test case out and it will show it works, both tests
    public void testRoleUpdate() throws Exception {
        GamePrices gt = factory.GamePricesSetup("Games of Wars","2013","480","xbox");

        // Updated Description follows

        GamePrices updateGameTitles = new GamePrices.Builder("Games of Wars 2")
                .copy(gt)
                .year("2014")
                .build();

        Assert.assertEquals(updateGameTitles.getYear(),"2014");
        Assert.assertEquals(gt.getTitle(),updateGameTitles.getTitle());
        Assert.assertEquals(gt.getId(),updateGameTitles.getId());
    }
}
