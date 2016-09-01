package vernon.ac.za.Factories;


import vernon.ac.za.Domain.GameComparing;

/**
 * Created by VERNON on 2016/04/18.
 */
public class GameComparingFactory {

    public static GameComparing GameComparingSetup(String title, String year, String comment)
    {
        GameComparing gt = new GameComparing
                .Builder()
                .title("Games of Wars")
                .year("2013")
                .comment("Awesome war game")
                .build();
        return gt;
    }
}
