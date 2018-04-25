package rocks.zipcodewilmington;

import com.sun.xml.internal.bind.v2.model.core.ID;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;
import sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    //TODO - Create tests for 'void testGetNumberOfDogs()'


    @Test
    public void testGetNumberOfDogs() {
        // Given(a dog)
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();


        // When(add a dog)
        DogHouse.add(animal);

        // Then(you have a dog)
        int dogNumber = DogHouse.getNumberOfDogs();
        Assert.assertEquals(1 ,  dogNumber);
    }


    @Test
    public void dogAddTest(){
        //given
        Dog dogster = AnimalFactory.createDog("Johnny", new Date());

        //When
        DogHouse.add(dogster);
        Dog dog = DogHouse.getDogById(dogster.getId());


        //Then

        Assert.assertEquals(dog, dogster);

    }


    @Test
    public void dogRemoveIDTest(){
        //Given
        Dog dog10 = AnimalFactory.createDog(null, new Date());

        //Then
        DogHouse.add(dog10);
        DogHouse.remove(dog10.getId());
        Dog dog3 = DogHouse.getDogById(dog10.getId());

        //When
        Assert.assertEquals(null, dog3);

}

    @Test
    public void dogRemoveDogTest(){
        //Given
        Dog dog = AnimalFactory.createDog(null, new Date());

        //Then
        DogHouse.add(dog);
        DogHouse.remove(dog);
        Dog dog2 = DogHouse.getDogById(dog.getId());

        Assert.assertEquals(null, dog2);

    }

    @Test
    public void getDogById(){
        //Given
        Dog dog = AnimalFactory.createDog(null, null);

        //When
        DogHouse.add(dog);
        DogHouse.getDogById(dog.getId());
        Dog dog2 = DogHouse.getDogById(455666778);
        //Then
        Assert.assertEquals(null, dog2);

    }


}
