import java.util.Scanner; //import

public class userInput {
    public static void main(String[] args){
        try (Scanner a = new Scanner(System.in)) {
            System.out.println("Enter a number");
            int n = a.nextInt(); // input
            System.out.println("You entered = " + n);
        }
    }
}
