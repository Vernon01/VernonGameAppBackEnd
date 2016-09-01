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
public class GameCategory implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String title; //The title of the game being rated
    private String year; //Year game was released
    private String category; //This specifies if it is a action or arcade game and so on..

    private GameCategory()
    {}

    public GameCategory (Builder builder)
    {
        this.title = builder.title;
        this.year = builder.year;
        this.category = builder.category;
        this.id = builder.id;
    }

    public String getTitle() {return title;}
    public String getYear() {return year;}
    public String getCategory() {return category;}
    public Long getId() {return id;}

    public static class Builder {

        private String title;
        private String year;
        private String category;
        private Long id;



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

        public Builder category(String category){
            this.category = category;
            return this;
        }

        public Builder copy(GameCategory value)
        {
            this.title = value.getTitle();
            this.year = value.getYear();
            this.category = value.getCategory();
            this.id = value.getId();
            return this;
        }

        public GameCategory build() {return new GameCategory(this);}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GameCategory)) return false;

        GameCategory that = (GameCategory) o;

        if (title != null ? !title.equals(that.title) : that.title != null)
            return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {return title != null ? title.hashCode() : 0;}

    @Override
    public String toString() {
        return "Game category{" +
                "is the following =" + title +
                '}';
    }
}
