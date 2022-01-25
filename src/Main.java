/**
 * Main Class
 * Always start with a Main class
 */
public class Main {
    //THis is a comment
    public static void printHelloWorld() {
        System.out.println("Hello world");
    }
    /**
     * This is the Main method the program starts here!
     * type psvn <tab> to generate the main method
     * @param args
     */
    public static void main(String[] args) {
        //This is a local variable it's used to store whole numbers
        //Java has 8 primitive data types
        int num1 = 1;
        double num2 = 2.5;
        boolean boolResult = true;
        //char = character
        char letter1 = 'a';
        //String is a class not a primitive data type
        //String has double quotes
        String str1 = "Hello";
        int num3 = 10;

        //Defined a class called Book
        //Make a new object of the Book class
        ///The lower case book is the object Book is the class
        Book book = new Book();

        //"" is an empty String
        //PEMDAS PEDMAS PODMAS BIDMAS BODMAS - order of operations
        System.out.println("" + (num1 + num2));

        System.out.println("Hello worlds");
        //Type sout <tab> to generate a println
        System.out.println();

        printHelloWorld();

    }
}
