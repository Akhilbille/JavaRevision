
class Employee{
    public int id;
    public double salary;
    public double extraPay;

    public Employee(int id,double salary){
        this(id,salary,0);
    }

    public Employee(int id, double salary, double extraPay){
        this.id = id;
        this.salary = salary;
        this.extraPay = extraPay;
    }

    public String  toString(){
        return (this.id+" "+this.salary+" "+this.extraPay);
    }
}


public class J32ConstructorOverloading {
    
    public static void main(String[] args){
        Employee emp = new Employee(1, 235.56, 123.6);
        Employee emp1 = new Employee(2, 235.56);
        System.out.println(emp);
        System.out.println(emp1);
    }

}
