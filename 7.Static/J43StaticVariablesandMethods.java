class HondaCity{
    static{
        System.out.println("Static block executed when class loaded");
    }
    static long price = 10_00_000;
    static double onRoadPrice(String city){
        switch(city){
            case "delhi":
                return((price*0.2)+price);
            case "Anantapur":
                return((price*0.1)+price);
            default:
                return(price*0.1);
        }

    }

}

public class J43StaticVariablesandMethods {
     public static void main(String[] args) {
        double price = HondaCity.onRoadPrice("Anantapur");
        System.out.println(price);
     }
    
}
