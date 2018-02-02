package ooplab8;

public class PersonApp {
    public  static  void  main (String[]args){
        //create object as student
        Student student = new Student("1111111111111", "Boy Saiyai","109 M.2 Thungsong",
                "Male","STD0001","Information System");
        System.out.println(student.toString());
        student.setName("Boy Saiyong");
        System.out.println(student.getName());


        //create object as student
        Employee Employee = new Employee("359211110050","kittiya","11 M.2 Thungsong","lady",
                "Student","6000","AM");
        System.out.println(Employee.toString());
    }//main
}//class
