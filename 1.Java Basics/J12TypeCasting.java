public class J12TypeCasting {
    public static void main(String[] args){
        //Widening: Small size to big size (Implicit/Upcasting)
        byte b = 110;
        short s = b;
        System.out.println(s);


        //This may cause loss of data and converting will be done forcefully
        double d = 12.3;
        float f = (float)d;
        System.out.println(f);
        // Narrowing: Big size to Small size (Explicit/Down Casting)

        short s1 = 31000;
        byte b1 = (byte)s1;//Data loss happend
        System.out.println(b1 + "  "+ s1);
    }
        
        

}
