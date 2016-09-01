package vernon.ac.za.Factories;


import vernon.ac.za.Domain.GameRatings;

/**
 * Created by VERNON on 2016/04/18.
 */
public class GameRatingsFactory {

    public static GameRatings GameRatingsSetup(String title,String year, String price, int rating)
    {
        GameRatings gt = new GameRatings
                .Builder("Games of Wars")
                .year("2013")
                .price("480")
                .rating(8)
                .build();
        return gt;
    }
}
