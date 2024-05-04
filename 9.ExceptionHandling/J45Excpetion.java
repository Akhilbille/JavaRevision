class Calculation{
    public void division(){
        try{
            int num = 1;
        int num2 = 0;
        int res = num / num2;
        System.out.println(res);
        }
        catch(ArithmeticException a){
            System.out.println(a.getMessage());
        }
    }
    
}
public class J45Excpetion {
    public static void main(String[] args) {
        Calculation cal = new Calculation();
        cal.division();
    }
    
}
