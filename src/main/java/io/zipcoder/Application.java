package io.zipcoder;


import java.util.ArrayList;
import java.util.SortedMap;
import java.util.TreeMap;

public class Application {


        Integer petCount;

        ArrayList<Pet> petArray = new ArrayList<Pet>();
        //SortedMap<String, String> petMap = new TreeMap<String, String>();

        IOConsole ioCons = new IOConsole();


        public void getUserPetCount() {

            String prompt = "Please input your total number of Pets.";
            petCount = ioCons.getIntegerInput(prompt);
        }

        public void getAllPetNames() {

            for (int i = 0; i < petCount; i++) {

                String prompt = "What is your pet's name";
                String petName = ioCons.getStringInput(prompt);

                String prompt2 = "What type of pet is " + petName;
                String petType = ioCons.getStringInput(prompt2);

                if(petType.toLowerCase().equals("cat")){
                    Pet cat = new Cat(petName);
                    petArray.add(cat);

                } if(petType.toLowerCase().equals("dog")) {
                    Pet dog = new Dog(petName);
                    petArray.add(dog);

                } else if(petType.toLowerCase().equals("hamster")){
                    Pet hamster = new Hamster(petName);
                    petArray.add(hamster);

                }else {
                    ioCons.print("You've entered an unsupported Pet Type. Good-bye!");
                }
            }
        }
    }
