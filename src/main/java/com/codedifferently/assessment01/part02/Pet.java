package com.codedifferently.assessment01.part02;

public abstract class Pet implements Animal {
    String name;
    Integer age;
    PetOwner owner ;

    /**
     * nullary constructor
     * by default, pet has age of 0; name of "";
     */
    public Pet() {
        this.age = 0;
        this.name = "";
        this.owner = null;
    }

    /**
     * @param name name of this pet
     */
    public Pet(String name) {
        this.age =0;
        this.name = name;
        this.owner = null;
    }


    /**
     * @param age age of this pet
     */
    public Pet(int age) {
        this.name = "";
        this.age = age;
        this.owner = null;
    }

    /**
     * @param name name of this pet
     * @param age age of this pet
     */
    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
        this.owner = null;
    }

    /**
     * @return name of this pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return age of this pet
     */
    public Integer getAge() {
        return this.age;
    }

    /**
     * @param newPetOwner the new owner of this pet
     * ensure this instance of `Pet` is added to the owner's composite `pets` list
     */
    public void setOwner(PetOwner newPetOwner) {
        this.owner = newPetOwner;
    }

    /**
     * @return PetOwner object whose composite `pets` collection contains this Pet instance
     */
    public PetOwner getOwner() {
        return this.owner;
    }



    public static void main(String[] args) {
        Pet anotherPet = new Dog();
        Pet newPet = new Dog();
        PetOwner po = new PetOwner("", newPet);
        System.out.println(newPet.getOwner());
    }

}