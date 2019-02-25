package io.zipcoder;

public class Hamster extends Pet{


    public Hamster(String name) {
        super(name);
    }

    public String getName() {
        return name;
    }

    public String speak() {
        return "meep";
    }
}
