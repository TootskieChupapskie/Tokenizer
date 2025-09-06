import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String testCase1 = "Ben built boots";
        String testCase2 = "Ben built Bloodthirster and Infinity Edge";


        Classifier.sentenceClassifier(testCase1);


//        String subject = InputHelper.extractSubject(testCase1);
//        String verb = InputHelper.extractCommand(testCase2);
//
//        InputHelper.extractItems(testCase2);
//        System.out.println(subject + " " + verb + " " + InputHelper.extractItems(testCase2));

        printCFG(testCase1);
    }

    public static void printCFG(String input) {
        Tokens parsedTokens = ActualTokenizer.tokenize(input);
        System.out.println(parsedTokens.getSubject() + " → <subject>");
        System.out.println(parsedTokens.getCommand() + " → <verb>");

        for (String item : InputHelper.extractItems(input)) {
            TokenType type = Classifier.ItemClassifier(item);
            System.out.println(item + " → <" + type.name() + ">");
        }
    }
}
