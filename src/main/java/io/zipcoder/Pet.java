package io.zipcoder;

public class Pet implements Comparable<Pet>{
    String name;

    public Pet(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int compareTo(Pet pet2) {
        int ans = this.name.compareTo(pet2.name);
        if(ans == 0){
            ans = this.getClass().toString().compareTo(pet2.getClass().toString());
        }
        return ans;
    }
}
