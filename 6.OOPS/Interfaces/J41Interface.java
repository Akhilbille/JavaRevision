
interface  HumanBeings{
    void talk();
    void play();    
}

class Person1 implements HumanBeings{
    public void talk(){
        System.out.println("Hi I am talking in telugu");
    }

    public void play(){
        System.out.println("I like to play Carroms");
    }

    public void sing(){
        System.out.println("I can sing...");
    }
}

class Person2 implements HumanBeings{
    public void talk(){
        System.out.println("HI I am talking in English");
    }

    public void play(){
        System.out.println("Hi I am playing Volley ball");
    }
}

public class J41Interface{
    public static void main(String[] args){
        HumanBeings obj = new Person1();
        obj.talk();
        obj.play();    
             
    }
}