package vernon.ac.za.Factories;



import org.junit.Assert;
import org.junit.Test;
import vernon.ac.za.Domain.TopGamesOfTheYear;

/**
 * Created by VERNON on 2016/04/18.
 */
public class TopGamesOfTheYearTest {

    private TopGamesOfTheYearFactory factory;

    @Test
    public void testRoleCreation() throws Exception {
        TopGamesOfTheYear gt = factory.TopGamesOfTheYearSetup("Games of Wars","2013");
        Assert.assertEquals(gt.getYear(),"2013");
    }


    @Test // can comment this test case out and it will show it works, both tests
    public void testRoleUpdate() throws Exception {
        TopGamesOfTheYear gt = factory.TopGamesOfTheYearSetup("Games of Wars","2013");

        // Updated Description follows

        TopGamesOfTheYear updateGameTitles = new TopGamesOfTheYear.Builder("Games of Wars 2")
                .copy(gt)
                .year("2014")
                .build();

        Assert.assertEquals(updateGameTitles.getYear(),"2014");
        Assert.assertEquals(gt.getTitle(),updateGameTitles.getTitle());
        Assert.assertEquals(gt.getId(),updateGameTitles.getId());
    }
}
