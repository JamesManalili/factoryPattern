package factoryPattern;

import java.util.Scanner;
//Manalili
public class Clinic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Integer choice = 0;
        while (choice != 3) {

            System.out.println("[1] Dog");
            System.out.println("[2] Cat");
            System.out.println("[3] Exit");
            System.out.print("Choose your pet number: ");
            choice = input.nextInt();

            if (choice == 3) {
                System.out.println("Program terminated");
                System.exit(0);
            }

            PetRecord petFile = new PetRecord();

            switch (choice) {
                case 1:
                    Pet pet = new Dog();
                    petFile.setPetId("D01");
                    petFile.setPetName("Bantay");
                    petFile.setPet(pet);
                    ((Dog)pet).setBreed("German Shepperd");
                    // petFile.setDogBreed("German Shepperd");
                    System.out.println("\nDog breed: " + ((Dog)pet).getBreed());
                    break;
                case 2:
                    pet = new Cat();
                    petFile.setPetId("C01");
                    petFile.setPetName("Muning");
                    petFile.setPet(pet);
                    ((Cat)pet).setNoOfLives(9);
                    System.out.println("\nNumber of lives: " + ((Cat)pet).getNoOfLives());
                    break;
            }
            System.out.println("Pet id is " + petFile.getPetId());
            System.out.println("Pet name is " + petFile.getPetName());
            System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
            System.out.println("Communication sound: " + petFile.getPet().makeSound());
            System.out.println("Play mode: " + petFile.getPet().play()+"\n");
        }
    }
}