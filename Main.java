import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Classifier classifier = new Classifier();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n(Instructions: Please enter a built item sentence in the format '<subject> <verb> <item(s)>')\n" +
                "-(Only input <item(s)> that are accessible in the Summoners Rift Shop in League of Legends)-\n" +
                "-----------------(Example: \"Ben built Bloodthirster and Infinity Edge\")-------------------\n\n"+
                "Enter your sentence below:");
    try {
        String sentence = scanner.nextLine();
        String[] dividedSentence = sentence.toUpperCase().split(" ");
        String acceptedSentence;
        if ((dividedSentence[0].matches(".*\\b(bought|purchased|built|acquired|upgraded)\\b.*"))) {

            System.out.println("Invalid sentence. Please follow the format '<subject> <verb> <item(s)>' since the first word is not a subject.");
        } else if (Items.weaponsAP.contains(dividedSentence[0]) ||
                Items.weaponsAD.contains(dividedSentence[0]) ||
                Items.armorPhysical.contains(dividedSentence[0]) ||
                Items.armorMagic.contains(dividedSentence[0]) ||
                Items.boots.contains(dividedSentence[0])) {

            System.out.println("Invalid sentence. Please follow the format '<subject> <verb> <item(s)>' since the first word is not a subject.");
        } else if (dividedSentence[0].isEmpty()) {
            System.out.println("Cannot be empty. Please enter a valid sentence.");
        } else {
            acceptedSentence = sentence;
            printCFG(acceptedSentence);
        }

    }catch (Exception e) {
        System.out.println("An error occurred");
    } finally {
        scanner.close();
    }}



    /**<program> → <sentence>
     <sentence> → <subject> <verb> <item>
     <itemList> → <item>
     <item> → <boots> | <armor> | <weapon>
     <boots> → Berserker's Greaves | Mercury's Treads
     <armor> → Thornmail | Randuin's Omen
     <weapon> → Bloodthirster | Infinity Edge

     <sentence> → <subject> <verb> <itemList>
     <itemList> → <item> | <item> , <itemList> | <item> and <itemList>
     <item> → <category> → <itemName>


     Sample output
     <program>
     ⇒ <sentence>
     ⇒ <subject> <Command> <itemList>
     ⇒ Ben built <item>
     ⇒ Ben built <boots>
     ⇒ Ben built Berserker's Greaves
     */


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

