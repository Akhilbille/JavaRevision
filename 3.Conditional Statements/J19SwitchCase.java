
public class J19SwitchCase {
    public static void main(String[] args){
        String option = "write";
        switch(option){
            case "write":
                System.out.println("Writing");
                break;
            case "read":
                System.out.println("Reading");
                break;
            default:
                System.out.println("No other options..Either Read or Write...");
        }
    }
    
}
