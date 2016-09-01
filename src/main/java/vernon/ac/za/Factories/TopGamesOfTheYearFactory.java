package vernon.ac.za.Factories;


import vernon.ac.za.Domain.TopGamesOfTheYear;

/**
 * Created by VERNON on 2016/04/18.
 */
public class TopGamesOfTheYearFactory {

    public static TopGamesOfTheYear TopGamesOfTheYearSetup(String title, String year)
    {
        TopGamesOfTheYear gc = new TopGamesOfTheYear
                .Builder("Games of Wars")
                .year("2013")
                .build();
        return gc;
    }
}
