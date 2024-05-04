//Overloading methods is called as Compile time Polymorphism.
class Calculation{

    public int max(int num,int num2){
        return Math.max(num, num2);
    }

    public float max(int num,float num2){
        return num>num2?num:num2;
    }
}


public class J38CompileTimePolymorphism {
    public static void main(String[] args){
        Calculation cal = new Calculation();
        System.out.println(cal.max(1,2));
        System.out.println(cal.max(1,2.3f));
    }
}
