
public class J4ReferenceTypes {
    // To store complex things like objects we use reference type.
    // new keyword is used to store the address of the object.
    public static void main(String[] args){
        // Creating an object
        String name = new String("Akhil Bille");
        System.out.println(name);

        String name1 = new String("Akhil Bille");
        System.out.println(name1);

        // Compares their address
        System.out.println(name == name1);
         

        //Compares their Values
         System.out.println(name.equals(name1));


        //  When we assign an object to other one then new object will store the address of the previous one not the value of the previous one. 
        // So when we modify any one of the objects both will get affected.
        
    }
    
    
}
