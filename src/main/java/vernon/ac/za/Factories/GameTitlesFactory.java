package vernon.ac.za.Factories;


import vernon.ac.za.Domain.GameTitles;

/**
 * Created by VERNON on 2016/04/18.
 */
public class GameTitlesFactory {

    public static GameTitles GameTitlesSetup(String title, String year, String machine)
    {
        GameTitles gt = new GameTitles
                .Builder("Games of Wars")
                .year("2013")
                .machine("PlayStation2")
                .build();
        return gt;
    }
}
