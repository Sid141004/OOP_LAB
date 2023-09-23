public class boxing {
    public static void main(String args[])
    {
        // Autoboxing
        Integer intObj = 5;       
        Double doubleObj = 10.5;   
        Character charObj = 'A';   
        Boolean boolObj = true;    
        // Unboxing
        int intValue = intObj;         
        double doubleValue = doubleObj; 
        char charValue = charObj;       
        boolean boolValue = boolObj;    

        System.out.println("Original values:");
        System.out.println("intObj: " + intObj);
        System.out.println("doubleObj: " + doubleObj);
        System.out.println("charObj: " + charObj);
        System.out.println("boolObj: " + boolObj);

        System.out.println("\nUnboxed values:");
        System.out.println("intValue: " + intValue);
        System.out.println("doubleValue: " + doubleValue);
        System.out.println("charValue: " + charValue);
        System.out.println("boolValue: " + boolValue);
    }
}
