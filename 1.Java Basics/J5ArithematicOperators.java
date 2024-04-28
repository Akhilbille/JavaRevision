public class J5ArithematicOperators {
    public static void main(String[] args){
        // Addition
            // Addition of byte + short + int : int
            //Any of the above combination results to int because of implicit conversion i.e., Coercion
            byte b = 12;
            int i = 13;
            short s = 16;
            int resultInt = b +s;
            resultInt = i + b;
            resultInt = i + s;
            System.out.println(resultInt);

            //If float present for addition then always resluts Float
            float f = 12.6f;
            float resultFloat = i+f;
            resultFloat = b + f;
            System.out.println(resultFloat);

            // Character + short results addition
            int c = 'A';
            
            int resultCS = c + s;
            System.out.println("Result of Character and Short: " + resultCS + c);
        
            //If Double adds with the other then it results double
            double d=12.3;
            double resultDouble = d + i;
            resultDouble = d+ f;
            System.out.println(resultDouble);

        
    }
}
