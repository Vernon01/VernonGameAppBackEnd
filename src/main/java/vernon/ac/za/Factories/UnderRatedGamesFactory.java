package vernon.ac.za.Factories;

import vernon.ac.za.Domain.UnderRatedGames;

/**
 * Created by VERNON on 2016/04/18.
 */
public class UnderRatedGamesFactory {

    public static UnderRatedGames UnderRatedGamesSetup(String title, String year, String reason)
    {
        UnderRatedGames gt = new UnderRatedGames
                .Builder("Games of Wars")
                .year("2013")
                .reason("excellent experience")
                .build();
        return gt;
    }
}
