package ooplab8;

public class PetApp {
    public static void main(String[]args){
        dog dog = new dog("kaya",2);
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        dog.makeNoise();


        cat cat = new cat("ELav",3);
        System.out.println(cat.getName());
        System.out.println(cat.getAge());


        Pet dog2 = new dog("Mo",2);
        System.out.println(dog2.getName());
        System.out.println(dog2.getAge());


    }//main
}//class
