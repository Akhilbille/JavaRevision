public class J15String {
    public static void main(String[] args){
        //Group of characters is called String
        //There is no specific data type for string but there is Class called String. String class will be used to work on Strings and it has many methods.

        // There are two ways to create a string one is assigning literal.
        String firstName = "Akhil";
        System.out.println(firstName);

        // Another way is by creating an Object.
        String fullName = new String("Akhil Bille");
        System.out.println(fullName);

        //Constructors for creating a String
            // String(char[]) -By providing group of Characters
            char ch[] = {'a','b','c','d'};
            String chars = new  String(ch);
            System.out.println(chars);
            
            // String(byte[]) -By providing group of bytes
            byte b[] = {96,97,98,99};
            String charsFromBytes = new String(b);
            System.out.println(charsFromBytes);

            //String(string) -By providing string which is wrapped by double Quotes
            String name = new String("Akhil");
            System.out.println("Name: " + name);

            // Comparing Strings
                // 1) Creating strings using Same string Literals
                //These values will be created in string pool
                String str = "Java";
                String str2 = "Java";

                //Results true since these compares there address and both stored in same address
                System.out.println(str == str2);
                //Results since both values are true
                System.out.println(str.equals(str2));

                // 2) Creating Strings using new keyword
                //These are objects which will be stored inside a heap.
                String text = new String("Java");
                String text1 = new String("Java");
                
                //Results false since its addresses are different
                System.out.println(text == text1);
                //Results true since both values are same
                System.out.println(text == text1);

    }
    
}
