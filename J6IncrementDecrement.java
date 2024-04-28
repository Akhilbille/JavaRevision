public class J6IncrementDecrement {
    public static void main(String[] args){
        int num = 12;
        
        // Increment
        //Post Increment
        System.out.println(num++);//Prints first then adds value: displays-12 -> 13 will be increment internally

        //Pre Increment
        System.out.println(++num);//first 13 will be added by one and it becomes 14 and displays-> 14

        //Decrement
        //Pre Decrement
        System.out.println(--num);//First 14 decreases by one and it becomes 13 and then it displays 13.

        // Pre Decrement
        System.out.println(num--);//First 13 will be displayed and then the 13 becomes 12.
    }
}
