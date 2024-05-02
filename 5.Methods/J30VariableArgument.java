public class J30VariableArgument {
    public static void main(String[] args){
        addN(1,2,3,4,5,6,7);
    }

    public static void addN(int ...num){
        int sum = 0;
        for(int value: num){
            sum += value;
        }
        System.out.println(sum);
    }
}
