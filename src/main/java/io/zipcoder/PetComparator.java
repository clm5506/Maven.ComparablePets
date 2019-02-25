package io.zipcoder;

import java.util.Comparator;

public class PetComparator implements Comparator<Pet> {

    public int compare(Pet firstPet, Pet secondPet) {
        int ans = firstPet.getClass().toString().compareTo(secondPet.getClass().toString());
        if(ans == 0){
            ans = firstPet.getName().compareTo(secondPet.getName());
        }
        return ans;
    }
}
