import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tokenizer tokenizer = new Tokenizer();
        System.out.println("Enter a string to tokenize (use \"space\" as a delimiter for each token): ");
        String[] input = scanner.nextLine().split(" ");
        System.out.println("\nUrri\n");
        try {
            String[] storedToken = tokenizer.tokenize(input);
            tokenizer.translateToken(storedToken);

        } catch (Exception e) {
            System.out.println("Input must not be empty.");
        }
    }


}