public abstract class J16StringMethods {
    public static void main(String[] args){
        //Strings are immutable (Cannot be modified)
        //Here objects will be created in heap and their address will  be attached as reference.
        String text = "/ I am AKhil Bille revising Java / ";

        // Methods
            //Length    
            int count = text.length();
            System.out.println(count);

            //toLowerCase
            String lowerCaseText = text.toLowerCase();
            System.out.println(lowerCaseText);

            //toUpperCase
            System.out.println(text.toUpperCase());

            //trim
            System.out.println(text.trim());

            //Substring(begin)
            System.out.println(text.substring(2));

            // Substring(begin,end)
            System.out.println(text.substring(2, 9));

            //Replace
            System.out.println(text.replace("Java", "java"));

            //Startswith
            System.out.println(text.startsWith("I"));

            //EndsWith
            System.out.println(text.endsWith("a"));

            //Char At
            System.out.println(text.charAt(2));

            // Index Of
            System.out.println(text.indexOf("Java"));

            // LastIndex of
            System.out.println(text.lastIndexOf('/'));

            //Equals 
            System.out.println(text.equals(lowerCaseText));
            
            //EqualsIgnoreCase
            System.out.println(text.equalsIgnoreCase(lowerCaseText));

            //CompareTo
            //Equals -> 0
            //A > b -> +ve value
            //A < b -> -ve value
            System.out.println("A".compareTo("a"));

            // Value Of
            //to convert any data type into string
            System.out.println(String.valueOf(123));
            
            // Contains
            // To check its presence
            System.out.println(text.contains("am"));





    }
}
