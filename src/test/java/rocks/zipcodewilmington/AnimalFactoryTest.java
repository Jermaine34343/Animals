package rocks.zipcodewilmington;

import com.sun.xml.internal.bind.v2.model.core.ID;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;
import java.util.zip.DataFormatException;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)` done
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)` done

    @Test
    public void createDogHouseTest(){

        //given(given a doghouse)
        String dogName = "";
        Date birthDay = new Date();
        int dogCreate = AnimalFactory.createDog(dogName,birthDay).getId();

        //when(Dogs are add)
        int retrieveId = DogHouse.getNumberOfDogs();

        //then(Doghouse have dogs)


        Assert.assertEquals(dogCreate, retrieveId);
    }


    @Test
    public void createCatHouseTest(){

        //given(given a doghouse)
        String catName = "";
        Date birthDay = new Date();
        int catCreate = AnimalFactory.createCat(catName,birthDay).getId();

        //when(Dogs are add)
        int retrieveId = CatHouse.getNumberOfCats();

        //then(CatHouse have cats)
        Assert.assertEquals(catCreate, retrieveId);
    }


}

