package rocks.zipcodewilmington;

import com.sun.xml.internal.bind.v2.model.core.ID;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.security.PublicKey;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)` done
    // TODO - Create tests for `speak` done
    // TODO - Create tests for `setBirthDate(Date birthDate)` done
    // TODO - Create tests for `void eat(Food food)` done
    // TODO - Create tests for `Integer getId()` done
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword` done
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword` done

    @Test
    public void setNameTest() {
        //given(new cat)
        Cat cat = new Cat (null, null, null);
        String givenName = "Frostii";

        //when (cat receives a name)
        cat.setName(givenName);

        //Then(cat haves a name)
        String catName = cat.getName();
        Assert.assertEquals(catName, givenName);
    }

    @Test
    public void speakTest(){

        //Given (cats Speaks meow)
        Cat cat = new Cat( null, null , null);
        String givenSpeak = "meow!";

        //when (cat speaks)
        String catSpeak = cat.speak();

        //Then(cat says meow)
        Assert.assertEquals(givenSpeak,catSpeak);
    }

    @Test
    public void getBirthdayTest(){
        //Given(Birthday of Cat)
        Date givenBirthday = new Date();
        Cat cat = new Cat(null, givenBirthday, null);
        //When(Cats receiving birthday)
        Date retrieveCatBirthday = cat.getBirthDate();
        //Then(cat gets Birthday)
        Assert.assertEquals(givenBirthday, retrieveCatBirthday);
    }

    @Test
    public void CatEatTest() {
        // Given(Give cat food)
        Cat cat = new Cat(null, null, null);
        Food food = new Food();
        int givenFood = cat.getNumberOfMealsEaten();

        // When(Cats eats food)
        cat.eat(food);
        int retrieveFood = cat.getNumberOfMealsEaten();

        // Then(get cat food)
        Assert.assertEquals(givenFood + 1, retrieveFood);
    }

//    Create tests for Integer getId()
//    ensure that when .getId is invoked on an instance of Dog, the respective id value is returned.

    @Test
    public void getIdTest(){

        //given(Cat is given ID)
        int getCatId = 04455646;
        Cat cat = new Cat(null,null, getCatId);

        //When(given their ID)
        int retrieveCatId = cat.getId();

        //Then(cat gets ID)
        Assert.assertEquals(getCatId, retrieveCatId);

    }

    @Test
    public void animalInheritanceTest(){
    //given(a cat)
    Cat cat = new Cat(null, null, null);

    //When(inherits Cat)
    boolean inheritanceOfCat = cat instanceof Animal;

    //Then(give true)
        Assert.assertEquals(true, inheritanceOfCat);
    }

    @Test
    public void mammalInheritanceTest(){

        //given(a cat)
        Cat cat = new Cat(null, null, null);

        //When(inherits mammals)
        boolean inheritanceOfMammal = cat instanceof Mammal;

        //Then(give true)
        Assert.assertEquals(true, inheritanceOfMammal);

    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // Then (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}