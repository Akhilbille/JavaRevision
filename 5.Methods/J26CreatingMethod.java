

public class J26CreatingMethod {

    public int max(int num1,int num2){
        return (num1>num2?num1:num2);
    }
    public static void main(String[] args){
        //Accessing methods of a class by creating an object.
        J26CreatingMethod obj = new J26CreatingMethod();
        System.out.println(obj.max(25, 26));


    }
}
