package io.zipcoder;

import java.util.Arrays;
import java.util.Comparator;

public class PetSorter implements Comparator<Pet> {

    Pet[] petArray;
    PetComparator pc = new PetComparator();

    public PetSorter(Pet[] input) {
        this.petArray = input;
    }

    public Pet[] sort() {

        Arrays.sort(petArray,pc);
        return petArray;
    }

    public int compare(Pet firstPet, Pet secondPet) {
          int ans = firstPet.getClass().toString().compareTo(secondPet.getClass().toString());
          if(ans == 0){
                ans = firstPet.name.compareTo(secondPet.name);
          }
        return ans;
    }
}
