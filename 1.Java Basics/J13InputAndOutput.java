import java.util.Scanner;

public class J13InputAndOutput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //Integer 
        System.out.println("Enter a number: ");
        byte b = input.nextByte();
        System.out.println("Enter a number:");
        short s = input.nextShort();
        System.out.println("Enter a number:");
        int i = input.nextInt();
        System.out.println("Enter a number: ");
        long l = input.nextLong();

        //Decimal
        System.out.println("Enter a float: ");
        float f = input.nextFloat();
        System.out.println("Enter a Double: ");
        double d = input.nextDouble();

        // String
        input.nextLine();
        System.out.println("Enter a Word: ");
        String oneWord = input.next();
        input.nextLine();
        System.out.println("Enter a Paragraph: ");
        String paragraph = input.nextLine();



    }
    
}
