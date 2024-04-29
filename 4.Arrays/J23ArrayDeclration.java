
public class J23ArrayDeclration {
    public static void main(String[] args){

        // Defining an array
        //The array object will be created in Heap.
        // This is a fixed size array of length 15 and initialised with default values.

        var arr = new int[15];
        System.out.println(arr.length);

        // To initialize values to array directly
        int[] marks= {96,85,45,74};


        //Accessing an array.
        // By iterating an array, we can handle this with index values.
        // By accessing this way we can edit or modify the array but by accessing them using forEach we cannot modify.
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

        // Using for each we cannot access their index but we can access their values directly.
        System.out.println("Using For each");
        for(int value: arr){
            System.out.println(value);
        }





        

    }
    
}
