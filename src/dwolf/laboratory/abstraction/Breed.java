package dwolf.laboratory.abstraction;

class Breed {
   private final String breedName;
   private String breedInfo;

   public Breed(String breedName, String breedInfo) {
       this.breedName = breedName;
       this.breedInfo = breedInfo;
   }

    public String getBreedName() {
        return breedName;
    }

    public String getBreedInfo() {
        return breedInfo;
    }

    public void setBreedInfo(String breedInfo) {
        this.breedInfo = breedInfo;
    }
}

abstract class Animal {
    private String animalName;
    private Breed breed;
    private Owner owner;
    private static int uniqueNumericIndetifier = 1;

    public Animal(String animalName, Breed breed, Owner owner) {
        this(animalName, breed);
        this.owner = owner;
    }

    public Animal(String animalName, Breed breed) {
        this(animalName);
        this.breed = breed;
    }

    public Animal(String animalName) {
        this.animalName = animalName;
    }
}
