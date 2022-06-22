package com.codedifferently.assessment01.part02;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;


public class PetOwner {
    String name;
     Pet [] pets ;
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet ... pets) {
        this.name = name;
        this.pets = pets;
        for(int i = 0; i < pets.length; i++){
            pets[i].setOwner(this);
        }

    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        if(pets ==  null){
            this.pets = new Pet[0];
            pets[0] = pet;
        }
        else {
            ArrayList<Pet> arrayList = new ArrayList<Pet>(Arrays.asList(pets));
            arrayList.add(pet);
            arrayList.toArray(pets);

        }

        pet.setOwner(this);


    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        if(pets != null) {
            ArrayList<Pet> arrayList = new ArrayList<Pet>(Arrays.asList(pets));
            arrayList.remove(pet);
            arrayList.toArray(pets);
        }

    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
     if(pets == null && pet.getOwner() == null) {
         return false;
     }

     for(int i = 0; i < pets.length; i++){
         if(pets[i].getOwner() == pet.getOwner()){
             return true ;
         }
     }

      return false;

    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        if(pets == null) {
            return null;
        }

        Integer min = pets[0].getAge();
        for(int i = 1; i < pets.length; i++){
            if(pets[i].getAge() < min){
                min = pets[i].getAge();
            }
        }
        return min;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        if(pets == null) {
            return null;
        }

        Integer max = pets[0].getAge();
        for(int i = 1; i < pets.length; i++){
            if(pets[i].getAge() > max){
                max = pets[i].getAge();
            }
        }
        return max;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
       int sum = 0;
       for(int i = 0; i < pets.length; i++){
           sum += pets[i].getAge();
       }
       return (float) sum/pets.length;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return pets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return pets;
    }



}
