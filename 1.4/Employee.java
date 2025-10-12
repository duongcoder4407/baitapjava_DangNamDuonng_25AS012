public class Employee {
    private int id;
    private String firstname;
    private String lastname;
    private int salary;
    public Employee(int id, String firstname, String lastname, int salary){
        this.id=id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }
    public int getId() {
        return 0;
    }
    public String getfirstname() {
        return this.firstname;
    }
    public String getlastname() {
        return this.lastname;
    }
    public String getName() {
        return this.firstname + this.lastname;
    }
    public int getSalary() {
        return 0;
    }
    public void setSalary(int salary) {
         this.salary = salary;
    }
    public int getAnnualSalary(){
        return this.salary*12;
    }
    public int RaiseAnnualSalary(int percent){
        this.salary *= salary*percent;
        return this.salary;
    }
    public String toString(){
        return "Employee[Id=" + this.id + "name=" + this.getName() + "salary=" + this.getSalary();
    }
}
