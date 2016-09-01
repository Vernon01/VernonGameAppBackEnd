package vernon.ac.za.Factories;


import vernon.ac.za.Domain.GameCategory;

/**
 * Created by VERNON on 2016/04/18.
 */
public class GameCategoryFactory {

    public static GameCategory GameCategorySetup(String title, String year, String category)
    {
        GameCategory gc = new GameCategory
                .Builder()
                .title("Games of Wars")
                .year("2013")
                .category("Action")
                .build();
        return gc;
    }
}
