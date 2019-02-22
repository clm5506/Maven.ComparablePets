package io.zipcoder;


import org.junit.Assert;
import org.junit.Test;

public class ApplicationTest {

    // Getter Tests
    @Test
    public void getDogNameTest() {
        String name = "Pogo";
        Dog dog = new Dog(name);

        String actual = dog.getName();
        Assert.assertEquals(name, actual);
    }

    @Test
    public void getCatNameTest() {
        String name = "Momo";
        Cat cat = new Cat(name);

        String actual = cat.getName();
        Assert.assertEquals(name, actual);
    }

    @Test
    public void getHamsterNameTest() {
        String name = "Hamtaro";
        Hamster hamster = new Hamster(name);

        String actual = hamster.getName();
        Assert.assertEquals(name, actual);
    }


    // Setter Tests

    @Test
    public void setDogNameTest() {
        String name = "Pogo";
        Dog dog = new Dog(name);
        String newName = "Blue";
        dog.setName(newName);


        String actual = dog.getName();
        Assert.assertEquals(newName, actual);
    }

    @Test
    public void setCatNameTest() {
        String name = "Momo";
        Cat cat = new Cat(name);
        String newName = "Momomomo";
        cat.setName(newName);

        String actual = cat.getName();
        Assert.assertEquals(newName, actual);
    }

    @Test
    public void setHamsterNameTest() {
        String name = "Hamtaro";
        Hamster hamster = new Hamster(name);
        String newName = "Tamagotchi";
        hamster.setName(newName);

        String actual = hamster.getName();
        Assert.assertEquals(newName, actual);
    }

    // Speak Tests

    @Test
    public void speakDogTest() {
        String name = "Pogo";
        Dog dog = new Dog(name);

        String expected = "Bark!";
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakCatTest() {
        String name = "Momo";
        Cat cat = new Cat(name);

        String expected = "Meow!";
        String actual = cat.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakHamsterTest() {
        String name = "Hamtaro";
        Hamster hamster = new Hamster(name);

        String expected = "meep";
        String actual = hamster.speak();
        Assert.assertEquals(expected, actual);
    }

    // Sort Method Tests

    @Test
    public void sortPetTest() {
        Pet pet1 = new Cat("Momo");
        Pet pet2 = new Dog("Old Yeller");
        Pet pet3 = new Hamster("Meepers Jeepers");

        Pet[] input = {pet2, pet3, pet1};
        Pet[] expected = {pet1, pet2, pet3};

        PetSorter sorter = new PetSorter(input);
        Pet[] actual = sorter.sort();
        Assert.assertArrayEquals(expected, actual);
    }

    // compareTo Tests

    @Test
    public void compareToNegativeTest() {
        Pet pet1 = new Cat("Momo");
        Pet pet2 = new Dog("Old Yeller");

        boolean actual = (pet1.compareTo(pet2) < 0);
        Assert.assertTrue(actual);
    }

    @Test
    public void compareToNegativeTest2() {
        Pet pet1 = new Cat("Momo");
        Pet pet2 = new Dog("Momo");

        Integer actual = (pet1.compareTo(pet2) );
        Assert.assertTrue(actual < 0);
    }

    @Test
    public void compareToNeutralTest() {
        Pet pet1 = new Cat("Momo");
        Pet pet2 = new Cat("Momo");

        Integer actual = (pet1.compareTo(pet2));
        Assert.assertTrue(actual == 0);
    }

    @Test
    public void compareToPositiveTest1() {
        Pet pet1 = new Cat("Thomas");
        Pet pet2 = new Dog("Momo");

        Integer actual = (pet1.compareTo(pet2));
        Assert.assertTrue(actual> 0);
    }

    @Test
    public void compareToPositiveTest2() {
        Pet pet1 = new Hamster("Momo");
        Pet pet2 = new Dog("Momo");

        Integer actual = (pet1.compareTo(pet2));
        Assert.assertTrue(actual > 0);
    }

}
