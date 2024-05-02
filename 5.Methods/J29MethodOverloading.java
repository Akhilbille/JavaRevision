public class J29MethodOverloading {
    public static void main(String[] args){
        System.out.println(add(1, 2));
        System.out.println(add(1.3f, 2.3f));
    
    }

    public static int add(int num1, int num2){
            return num1+num2;
    }

    public static float add(float num1,float num2){
        return num1+num2;
    }



}