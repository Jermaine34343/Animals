package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)` done
    // TODO - Create tests for `speak` done
    // TODO - Create tests for `setBirthDate(Date birthDate)` done
    // TODO - Create tests for `void eat(Food food)` done
    // TODO - Create tests for `Integer getId()` done
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword` done
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword` done



    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void speakTest(){

        //Given (dog Speaks bark)
        Dog dog = new Dog( null, null , null);
        String givenSpeak = "bark!";

        //when (dog speaks)
        String dogSpeak = dog.speak();

        //Then(cat says meow)
        Assert.assertEquals(givenSpeak,dogSpeak);
    }

    @Test
    public void getBirthdayTest(){

        //Given(Birthday of dog)
        Date givenBirthday = new Date();
        Dog dog = new Dog(null, givenBirthday, null);

        //When(dog receiving birthday)
        Date retrieveCatBirthday = dog.getBirthDate();

        //Then(dog gets Birthday)
        Assert.assertEquals(givenBirthday, retrieveCatBirthday);
    }

    @Test
    public void dogEatTest() {

        // Given(Give dog food)
        Dog dog = new Dog(null, null, null);
        Food food = new Food();
        int givenFood = dog.getNumberOfMealsEaten();

        // When(dogs eats food)
        dog.eat(food);
        int retrieveFood = dog.getNumberOfMealsEaten();

        // Then(get dog food)
        Assert.assertEquals(givenFood + 1, retrieveFood);
    }

    @Test
    public void getIdTest(){

        //given(Dog is given ID)
        int getDogId = 3847362;
        Dog dog = new Dog(null,null, getDogId);

        //When(given their ID)
        int retrieveDogId = dog.getId();

        //Then(Dog gets ID)
        Assert.assertEquals(getDogId, retrieveDogId);

    }

    @Test
    public void mammalInheritanceTest(){

        //given(a dog)
        Dog dog = new Dog(null, null, null);

        //When(inherits mammals)
        boolean inheritanceOfMammal = dog instanceof Mammal;

        //Then(give true)
        Assert.assertEquals(true, inheritanceOfMammal);

    }

    @Test
    public void animalInheritanceTest(){

        //given(a dog)
        Dog dog = new Dog(null, null, null);

        //When(inherits Dog)
        boolean inheritanceOfCat = dog instanceof Animal;

        //Then(give true)
        Assert.assertEquals(true, inheritanceOfCat);
    }

    @Test
    public void constructorTest() {
        String givenName = "Wiluf";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // Then (we retrieve data from the dog)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = Dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
        }

}