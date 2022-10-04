import java.util.*;
public class EvenEntryLoop {
    public static void main (String args[]) {
        final int STOP = 999;
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an even number or " + STOP + " to stop >> ");
        num = sc.nextInt();
        while(num != STOP) {
            if(num%2 == 0) {
            System.out.println("Good job!");
            System.out.print("Enter an even number or 999 to stop >> ");
            num = sc.nextInt();
        }
            else {
                if(num%2 == 1) {
                    System.out.println(num + " is not an even number");
                    System.out.print("Enter an even number or 999 to stop >> ");
                    num = sc.nextInt();
        }
        }

    }
}
}
