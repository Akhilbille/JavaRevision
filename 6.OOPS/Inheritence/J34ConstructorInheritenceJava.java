class Parent{
    public Parent(){
        System.out.println("PArent Constructor");
    }
}

class Child extends Parent{
    public Child(){
        System.out.println("Child Constructor");
    }
}

public class J34ConstructorInheritenceJava {
    public static void main(String[] args){
        // Parent obj = new Parent();//Only Parent Constructor will execute
        Child obj1 = new Child();
        
        
    }
    
}
