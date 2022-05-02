import java.util.ArrayList;

public class EmployeeInfo {
    public static void main(String[] args){
        Employee one = new Employee(1, "Robert", 1994, 2000.00, new Address(64, "WallsStreet", "New York", 123456));
        Employee two = new Employee(2, "Sam", 2000, 1800.00, new Address(68, "WallsStreet", "New York", 123456));
        Employee three = new Employee(3, "John", 1999, 1900.00, new Address(26, "WallsStreet", "New York", 123456));

        EmployeeBook eb = new EmployeeBook();
        eb.addEmployee(one);
        eb.addEmployee(two);
        eb.addEmployee(three);
        //eb.print();
        eb.removeEmployee(two);

        EmployeeOther four = new EmployeeOther("James", "Microsoft", 44);
        eb.addEmployee(four);
        eb.print();
    }
}

class EmployeeBook{
    public ArrayList<Employee> book = new ArrayList<Employee>();

    public void addEmployee(Employee a){
        book.add(a);
    }

    public void removeEmployee(Employee a){
        int search = a.id;
        for(int i = 0; i < book.size(); i++){
            if(book.get(i).id == search)
                book.remove(i);
            book.trimToSize();
        }
    }

    public void print(){
        for(int i = 0; i < book.size(); i++){
            book.get(i).print();
        }  
    }
}

class Address{
    public int number;
    public String street;
    public String city;
    public int postcode;
    
    public Address(int n, String s, String c, int pc){
        this.number = n;
        this.street = s;
        this.city = c;
        this.postcode = pc;
    }
}

class Employee{
    public int id;
    public String name;
    public int year;
    public double salary;
    public Address address;

    public Employee(int id, String n, int y, double s, Address a){
        this.id = id;
        this.name = n;
        this.year = y;
        this.salary = s;
        this.address = a;
    }
    public Employee(String n){
        this.name = n;
    }

    public void print(){
        System.out.println(id + " " + name + ", " + year + ", " + salary + ", " + address.street + ", " + address.number + ", " + address.postcode + ", " + address.city);
    }
    
}

class EmployeeOther extends Employee{
    public String company;
    public int dayCount;

    public EmployeeOther(String n, String c, int dc){
        super(n);
        this.company = c;
        this.dayCount = dc;
    }

    public void print(){
        System.out.println(name + ", " + company + ", " + dayCount);
    }
}
