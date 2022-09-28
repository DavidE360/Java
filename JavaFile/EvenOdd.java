import java.util.Scanner;
public class EvenOdd {

        public static void main(String[] args) {
            // Write your code here

            System.out.println("Please enter a whole number >> ");
            Scanner inputDevice = new Scanner(System.in);
            int number = inputDevice.nextInt();


            if (number%2==0){
                System.out.println("The number is even.");
            }
            else
                System.out.println("The number is odd.");

        }
}
