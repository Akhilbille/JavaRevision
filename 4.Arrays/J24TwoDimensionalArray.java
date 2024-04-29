

public class J24TwoDimensionalArray {
    public static void main(String[] args){
        //Defining two dimensional array
        int[][]  arr =new int[5][5];

        // Defining an array by directly assigning values
        int[][] arr1 = {{1,2},{3,4},{5,6},{7,8}};
        
        //Accessing an two dimensional Array
        for(int values[]:arr1){
            for(int value:values){
                System.out.print(value+"  ");
            }
            System.out.println();
        }
    }
}
