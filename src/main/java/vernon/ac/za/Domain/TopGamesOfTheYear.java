package vernon.ac.za.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by VERNON on 2016/04/18.
 */

@Entity
public class TopGamesOfTheYear implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String title; //The title of the game being rated
    private String year; //Year game was released

    private TopGamesOfTheYear()
    {}

    public TopGamesOfTheYear (Builder builder)
    {
        title = builder.title;
        year = builder.year;
        id = builder.id;
    }

    public String getTitle() {return title;}
    public String getYear() {return year;}
    public Long getId() {return id;}

    public static class Builder {

        private String title;
        private String year;
        private Long id;

        public Builder(String title) {
            this.title = title;
        }

        public Builder id(Long value)
        {
            this.id = value;
            return this;
        }

        public Builder title(String title){
            this.title = title;
            return this;
        }

        public Builder year(String year){
            this.year = year;
            return this;
        }


        public Builder copy(TopGamesOfTheYear value)
        {
            this.title = value.getTitle();
            this.year = value.getYear();
            this.id = value.getId();
            return this;
        }

        public TopGamesOfTheYear build() {return new TopGamesOfTheYear(this);}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TopGamesOfTheYear)) return false;

        TopGamesOfTheYear that = (TopGamesOfTheYear) o;

        if (title != null ? !title.equals(that.title) : that.title != null)
            return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {return title != null ? title.hashCode() : 0;}

    @Override
    public String toString() {
        return "Game being rated from top down{" +
                "is the following =" + title +
                '}';
    }
}
