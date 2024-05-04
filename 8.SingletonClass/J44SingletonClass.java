class CoffeMachine{
    static private CoffeMachine our = null;

    static public CoffeMachine getInstance(){
        if(our == null)
            our = new CoffeMachine();
        return our;
    }

    // public String toString(){
    //     return("Coffe Machine Created Once");
        
    // }
}


public class J44SingletonClass {
    public static void main(String[] args) {
        CoffeMachine obj = CoffeMachine.getInstance();
        CoffeMachine obj2 = CoffeMachine.getInstance();
        System.out.println(obj);
        System.out.println(obj2);
    }
}
