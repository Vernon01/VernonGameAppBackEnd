package vernon.ac.za.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import vernon.ac.za.Domain.GameCategory;
import vernon.ac.za.Services.GameCategoryService;

import java.util.List;

/**
 * Created by VERNON on 2016/08/30.
 */

@RestController
@RequestMapping("/api/**")
public class GameCategoryPage {

    @Autowired
    GameCategoryService gameCatService;

    @RequestMapping(value = "/GameCategories/", method = RequestMethod.GET)
    public ResponseEntity<List<GameCategory>> listAllGameCategories() {
        List<GameCategory> gameCat = gameCatService.findAll();
        if(gameCat.isEmpty())
            return new ResponseEntity<List<GameCategory>>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<List<GameCategory>>(gameCat, HttpStatus.OK);
    }

    @RequestMapping(value = "/GameCategories/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GameCategory> getGameCategory(@PathVariable("id") long id) {
        System.out.println("Fetching Game Category with id " + id);
        GameCategory gameCat = gameCatService.readById(id);
        if (gameCat == null) {
            System.out.println("GameCategories with id " + id + " not found");
            return new ResponseEntity<GameCategory>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<GameCategory>(gameCat,HttpStatus.OK);
    }

    @RequestMapping(value = "/GameCategories/create", method = RequestMethod.POST)
    public ResponseEntity<Void> createGameCategory(@RequestBody GameCategory gameCat, UriComponentsBuilder ucBuilder) {
        System.out.println("Creating GameCategory " + gameCat.getCategory());

        gameCatService.update(gameCat);

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/GameCategories/{id}").buildAndExpand(gameCat.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/GameCategories/update/{id}", method = RequestMethod.PUT)
    public ResponseEntity<GameCategory> updatePatient(@PathVariable("id") long id, @RequestBody GameCategory gameCat) {
        System.out.println("Updating Patient " + id);

        GameCategory currentGameCat = gameCatService.readById(id);

        if (currentGameCat==null) {
            System.out.println("GameCategory with id " + id + " not found");
            return new ResponseEntity<GameCategory>(HttpStatus.NOT_FOUND);
        }

        GameCategory updatedGameCat = new GameCategory
                .Builder()
                .copy(currentGameCat)
                .title(gameCat.getTitle())
                .year(gameCat.getYear())
                .category(gameCat.getCategory())
                .id(gameCat.getId())
                .build();
        gameCatService.update(updatedGameCat);
        return new ResponseEntity<GameCategory>(updatedGameCat, HttpStatus.OK);
    }

    @RequestMapping(value = "/GameCategories/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<GameCategory> deletePatient(@PathVariable("id") long id) {
        System.out.println("Fetching & Deleting GameCategory with id " + id);

        GameCategory gameCat = gameCatService.readById(id);
        if (gameCat == null) {
            System.out.println("Unable to delete. GameCategory with id " + id + " not found");
            return new ResponseEntity<GameCategory>(HttpStatus.NOT_FOUND);
        }

        gameCatService.delete(gameCat);
        return new ResponseEntity<GameCategory>(HttpStatus.NO_CONTENT);
    }

}
