class Parent1{
    public void display(){
        System.out.println("Hello");
    }
}

class Sub1 extends Parent1{
    public void display(){
        System.out.println("Hello World");
    }
}

public class J36MethodOverriding {
    public static void main(String[] args){
        Sub1 obj = new Sub1();
        obj.display();
    }
    
}