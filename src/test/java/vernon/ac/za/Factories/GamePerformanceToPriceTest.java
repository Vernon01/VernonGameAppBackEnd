package vernon.ac.za.Factories;



import org.junit.Assert;
import org.junit.Test;
import vernon.ac.za.Domain.GamePerformanceToPrice;

/**
 * Created by VERNON on 2016/04/18.
 */
public class GamePerformanceToPriceTest {

    private GamePerformanceFactory factory;

    @Test
    public void testRoleCreation() throws Exception {
        GamePerformanceToPrice gt = factory.GamePerformanceSetup("Games of Wars","2013","pay the price for a good game");
        Assert.assertEquals(gt.getYear(),"2013");
        Assert.assertEquals(gt.getOpinion(),"pay the price for a good game");
    }


    @Test // can comment this test case out and it will show it works, both tests
    public void testRoleUpdate() throws Exception {
        GamePerformanceToPrice gt = factory.GamePerformanceSetup("Games of Wars","2013","pay the price for a good game");

        // Updated Description follows

        GamePerformanceToPrice updateGameTitles = new GamePerformanceToPrice.Builder("Games of Wars 2")
                .copy(gt)
                .year("2014")
                .build();

        Assert.assertEquals(updateGameTitles.getYear(),"2014");
        Assert.assertEquals(gt.getTitle(),updateGameTitles.getTitle());
        Assert.assertEquals(gt.getId(),updateGameTitles.getId());
    }
}
