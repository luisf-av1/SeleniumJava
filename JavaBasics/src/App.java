import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        //Variables example | static function example 
        App.variableExample();

        //Get user input example | method example 
        App example = new App();
        example.userInputExample();

        //operators example | return & parameters example
        double finalGrade = getAverageGrade(5.0,4.5,2.5);
        System.out.println("Your final grade is; " + Double.toString(finalGrade));
        

    }

    public static void variableExample(){
        //Variables
        String name = "luis";
        char initial = 'L';
        byte maxByte = Byte.MAX_VALUE;
        short maxShort = Short.MAX_VALUE;
        int maxInt = Integer.MAX_VALUE;
        long maxLong = Long.MAX_VALUE;
        float maxFloat = Float.MAX_VALUE;
        double maxDouble = Double.MAX_VALUE;
        boolean state = 1 > 2;

        //Constants
        final String CONS = "Keep your determination"; 

        //Prints
        System.out.println("Hello, Java!");

        System.out.println("\nname: " + name);
        System.out.println("Initial: " + initial);
        System.out.println("Your constant is: " + CONS);

        System.out.println("\nmaxByte: " + maxByte);
        System.out.println("maxShort: " + maxShort);
        System.out.println("maxInt: " + maxInt);
        System.out.println("maxLong: " + maxLong);
        System.out.println("maxFloat: " + maxFloat);
        System.out.println("maxDouble: " + maxDouble);

        System.out.println("\n1 > 2? " + state);
    }
    public void userInputExample(){
        //Initialize
        int assignmentTotal = 40;
        int examTotal = 20;
        int assignmentGrade;
        int examGrade;

        // get input
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your total assignment grade:");
        assignmentGrade = input.nextInt();

        System.out.println("Please enter your final exam grade:");
        examGrade = input.nextInt();


        //Process data
        int studentGrade = assignmentGrade + examGrade;
        int total = assignmentTotal + examTotal;
        float percentage = (float) studentGrade/total * 100;

        System.out.println("Your total grade is: " + studentGrade);
        System.out.println("Your percentage is: " + percentage);

    }
    public static double getAverageGrade( double grade1, double grade2, double grade3){
        System.out.println("\nGrades: " + Double.toString(grade1) + ", " + Double.toString(grade2) + ", " + Double.toString(grade3) );
        return (grade1 + grade2 + grade3)/3;
    }
}