class FortunerBasic{
    private int price = 15;
    public String color = "blue"; 

    public void basicFeatures(){
        System.out.println("All Basic Features");
    }
}

class FortunerTopEnd extends FortunerBasic{
    private int price = 12;
    public String color = "red";

    public void topFeatures(){
        basicFeatures();
        System.out.println("All top end Features");

    }
}

public class J33Inheritence {
    public static void main(String[] args){
        FortunerTopEnd car = new FortunerTopEnd();
        System.out.println(car.color);
        car.topFeatures();
    }    
    
}
