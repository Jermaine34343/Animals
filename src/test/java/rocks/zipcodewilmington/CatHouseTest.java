package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`


    @Test
    public void testGetNumberOfCats() {
        // Given (some
        String name = "Waffles";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);

        // Then
       int catNumber = CatHouse.getNumberOfCats();
        Assert.assertEquals(1, catNumber);
    }

    @Test
    public void catAddTest(){
        //given
        Cat animal2 = AnimalFactory.createCat("Parrot", new Date());
        CatHouse.clear();
        //When
        CatHouse.add(animal2);

        //Then
        int catNumber2 = CatHouse.getNumberOfCats();
        Assert.assertEquals(1, catNumber2);

    }


    @Test
    public void catRemoveIDTest(){
        //Given
        Cat cat10 = AnimalFactory.createCat(null, new Date());
        CatHouse.clear();

        //Then
        CatHouse.add(cat10);
        CatHouse.remove(cat10.getId());
        Cat cat3 = CatHouse.getCatById(cat10.getId());

        //When
        Assert.assertEquals(null, cat3);

    }

    @Test
    public void catRemoveDogTest(){
        //Given
        Cat cat = AnimalFactory.createCat(null, new Date());

        //Then
        CatHouse.add(cat);
        CatHouse.remove(cat);
        Cat cat2 = CatHouse.getCatById(cat.getId());

        Assert.assertEquals(null, cat2);

    }

    @Test
    public void getCatById(){
        //Given
        Cat cat = AnimalFactory.createCat(null, null);

        //When
        CatHouse.add(cat);
        CatHouse.getCatById(cat.getId());
        Cat cat2 = CatHouse.getCatById(455666778);
        //Then
        Assert.assertEquals(null, cat2);

    }


}
