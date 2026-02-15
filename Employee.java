package Lab04_Tasks;

public class Employee {
    private String id;
    public String name;

    Employee(){}; //default constructor

    Employee(String Pid, String Pname){
        this.id = Pid;
        this.name = Pname;
    }

    Employee(Employee a){
        this.id = a.id;
        this.name = a.name;
    }

    public void setId(String b){
        this.id = b;
    }

    public String getId(){
        return this.id;
    }

    public void updateName(String c){
        this.name = c;
    }

    public void displayInformation(){
        System.out.println("Employee ID : " + this.id);
        System.out.println("Employee Name : " + this.name);
    }

    public static void main(String[] args){
        Employee e1 = new Employee("10", "Ali");
        Employee e2 = new Employee(e1);
        e1.displayInformation();
        e2.displayInformation();
        e2.setId("20");
        e2.updateName("Umar");
        e2.displayInformation();
    }
}
