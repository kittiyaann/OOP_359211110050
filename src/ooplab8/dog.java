package ooplab8;
//Dog is a Pet
//Dog is sub-class
//Dog is super-class

public class dog extends Pet {
    public dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Box Box !!!");
    }
}//class
