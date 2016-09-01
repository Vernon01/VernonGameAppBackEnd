package vernon.ac.za.Factories;


import vernon.ac.za.Domain.GamePerformanceToPrice;

/**
 * Created by VERNON on 2016/04/18.
 */
public class GamePerformanceFactory {

    public static GamePerformanceToPrice GamePerformanceSetup(String title, String year, String opinion)
    {
        GamePerformanceToPrice gt = new GamePerformanceToPrice
                .Builder("Games of Wars")
                .year("2013")
                .opinion("pay the price for a good game")
                .build();
        return gt;
    }
}
