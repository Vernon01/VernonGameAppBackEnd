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
public class GameComparing implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String title; //The title of the game being rated
    private String year; //Year game was released
    private String comment; //This is what the person comparing the games think of the versions

    private GameComparing()
    {}

    public GameComparing (Builder builder)
    {
        title = builder.title;
        year = builder.year;
        comment = builder.comment;
        id = builder.id;
    }

    public String getTitle() {return title;}
    public String getYear() {return year;}
    public String getComment() {return comment;}
    public Long getId() {return id;}

    public static class Builder {

        private String title;
        private String year;
        private String comment;
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

        public Builder comment(String comment){
            this.comment = comment;
            return this;
        }

        public Builder copy(GameComparing value)
        {
            this.title = value.getTitle();
            this.year = value.getYear();
            this.comment = value.getComment();
            this.id = value.getId();
            return this;
        }

        public GameComparing build() {return new GameComparing(this);}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GameComparing)) return false;

        GameComparing that = (GameComparing) o;

        if (title != null ? !title.equals(that.title) : that.title != null)
            return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {return title != null ? title.hashCode() : 0;}

    @Override
    public String toString() {
        return "Game being compared{" +
                "is the following =" + title +
                '}';
    }
}
