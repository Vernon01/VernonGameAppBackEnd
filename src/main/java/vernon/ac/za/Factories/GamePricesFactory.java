package vernon.ac.za.Factories;


import vernon.ac.za.Domain.GamePrices;

/**
 * Created by VERNON on 2016/04/18.
 */
public class GamePricesFactory {

    public static GamePrices GamePricesSetup(String title, String year, String price, String machine)
    {
        GamePrices gt = new GamePrices
                .Builder("Games of Wars")
                .year("2013")
                .price("480")
                .machine("xbox")
                .build();
        return gt;
    }
}
