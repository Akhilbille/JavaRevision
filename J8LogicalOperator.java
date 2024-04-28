public class J8LogicalOperator {
    public static void main(String[] args){
        //This operator is used to make complex conditions
        // Starts evaluating the expression from the left side 
        // && -> if one expression false then it stops executing the expression
        // || -> if one expression results true then it will stops executing
        // ! -> Converts results into opposite
        int salary = 20_000;
        short creditScore = 800;
        boolean isCriminal = false;
        if((salary > 10000 || creditScore > 500) && !isCriminal)
            System.out.println("Eligible");
    }
    
}
