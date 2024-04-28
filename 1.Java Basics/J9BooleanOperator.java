public class J9BooleanOperator {
    public static void main(String[] args ){
        //This is not shortcircuit even one of the expression fails it will check for the others so beacause of this the results will get varied.

        int x = 0;
        if (false & (1 == ++x)) {
            System.out.println("Inside of if");
            }
        System.out.println(x); //"1"
    }

}
