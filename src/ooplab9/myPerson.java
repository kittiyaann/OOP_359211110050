package ooplab9;

public class myPerson {
    public static void main(String[] args) {
        Person person = new Person("ann","23",new Address("38/2","Susattani","84210"),
                new Job("Administration","9000"));

        System.out.println(person.toString());

        //edit data of object
        person.getJob().setSalary("20000");
        System.out.println(person.getJob().getPositino());
        System.out.println(person.getJob().getSalary());



    }
}//class

