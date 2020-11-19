# VetClinic


Vet Clinic
Preparation
Download the skeleton provided in Judge. Do not change the packages!
Pay attention to name the package parking, all the classes, their fields and methods the same way they are presented in the following document. It is also important to keep the project structure as described.
Problem description
Your task is to create a repository, which stores items by creating the classes described below.
First, write a Java class Pet with the following fields:
name: String
age: int
owner: String
The class constructor should receive name, age and owner.  You need to create the appropriate getters and setters. The class should override the toString() method in the following format:
"{name} {age} ({owner})"
Next, write a Java class Clinic that has data (a collection, which stores the Pets). All entities inside the repository have the same fields. Also, the Clinic class should have those filelds:
capacity: int
The class constructor should receive capacity, also it should initialize the data with a new instance of the collection. Implement the following features:
Field data – List that holds added pets
Method add(Pet pet) – adds an entity to the data if there is an empty cell for the pet.
Method remove(String name) – removes the pet by given name, if such exists, and returns boolean.
Method getPet(String name, String owner) – returns the pet with the given name and owner or null if no such pet exists.
Method getOldestPet() – returns the oldest Pet.
Getter getCount – returns the number of pets.
getStatistics() – returns a String in the following format:
"The clinic has the following patients:
{name} {owner}
{name} {owner} 
   (…)"
Constraints
The combinations of names and owners will always be unique.
The age of the pets will always be positive.

Examples
This is an example of how the Clinic class is intended to be used. 
Sample code usage
// Initialize the repository
Clinic clinic = new Clinic(20);

// Initialize entity
Pet dog = new Pet("Ellias", 5, "Tim");

// Print Pet
System.out.println(dog); // Ellias 5 (Tim)

// Add Pet
clinic.add(dog);

// Remove Pet
System.out.println(clinic.remove("Ellias")); // true
System.out.println(clinic.remove("Pufa")); // false

Pet cat = new Pet("Bella", 2, "Mia");
Pet bunny = new Pet("Zak", 4, "Jon");

clinic.add(cat);
clinic.add(bunny);

// Get Oldest Pet
Pet oldestPet = clinic.getOldestPet();
System.out.println(oldestPet); // Zak 4 (Jon)

// Get Pet
Pet pet = clinic.getPet("Bella", "Mia");
System.out.println(pet); // Bella 2 (Mia)

// Count
System.out.println(clinic.getCount()); // 2

// Get Statistics
System.out.println(clinic.getStatistics());
//The clinic has the following patients:
//Bella Mia
//Zak Jon
Submission
Zip all the files in the project folder except bin and obj folders
Submit single .zip file, containing vetClinic package, with the classes inside (Pet, Clinic and the Main class), there is no specific content required inside the Main class e. g. you can do any kind of local testing of you program there. However there should be main(String[] args) method inside.
