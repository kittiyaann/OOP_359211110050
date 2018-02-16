package ooplab9;

public class Job {
    private String positino;
    private String Salary;
    //constructor

    public Job(String positino, String salary) {
        this.positino = positino;
        Salary = salary;
    }



    //getter and setter method


    public String getPositino() {
        return positino;
    }

    public void setPositino(String positino) {
        this.positino = positino;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String salary) {
        Salary = salary;
    }
    //toString()

    @Override
    public String toString() {
        return "Job{" +
                "positino='" + positino + '\'' +
                ", Salary='" + Salary + '\'' +
                '}';
    }
}//class