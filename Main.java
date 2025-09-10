import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /**
         *
         * Summary: This section contain the process that accepts input and checks input before following the printing process
         *
         */

        Classifier classifier = new Classifier();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n(Instructions: Please enter a built item sentence in the format '<subject> <verb> <item(s)>')\n" +
                " (Only input <item(s)> that are accessible in the Summoners Rift Shop in League of Legends)\n" +
                "  ---------------(Example: \"Ben built Bloodthirster and Infinity Edge\")-------------------\n\n"+
                "Enter your sentence below:");
    try {
        String sentence = scanner.nextLine().trim();
        String[] dividedSentence = sentence.split(" ");
        String acceptedSentence = "";
        if ((dividedSentence[0].matches(".*\\b(bought|built|acquired|sold|upgraded)\\b.*"))){

            System.out.println("Invalid sentence. Please follow the format '<subject> <verb> <item(s)>' since the first word is not a subject.");
        }
        else if (ItemList.weaponsAP.contains(dividedSentence[0].toUpperCase()) ||
                ItemList.weaponsAD.contains(dividedSentence[0].toUpperCase()) ||
                ItemList.armorPhysical.contains(dividedSentence[0].toUpperCase()) ||
                ItemList.armorMagic.contains(dividedSentence[0].toUpperCase()) ||
                ItemList.boots.contains(dividedSentence[0].toUpperCase())) {

            System.out.println("Invalid sentence. Please follow the format '<subject> <verb> <item(s)>' since the first word is not a subject.");
        }
        else if (dividedSentence[0].isEmpty()) {
            System.out.println("Cannot be empty. Please enter a valid sentence.");
        }
        else if(!dividedSentence[1].matches(".*\\b(bought|built|acquired|sold|upgraded)\\b.*")) {
            System.out.println("Invalid sentence. Please follow the format '<subject> <verb> <item(s)>' since the second word is not an action.");
        }
        else {
            acceptedSentence = sentence;
            System.out.println();
            PrintPhases.printPhaseOne(acceptedSentence);
            PrintPhases.printPhaseTwo(dividedSentence[0],dividedSentence[1],acceptedSentence);
        }

        }catch(IndexOutOfBoundsException e) {
        System.out.println("Invalid sentence. Please follow the format \"<subject> <verb> <item(s)>\"\n" +
                "ensure you include at least one subject, one verb, one item.");
        }catch (Exception e) {
        System.out.println("An error occurred");
         } finally {
        scanner.close();
        }
    }
}
/**
 *      <sentence> → <subject> <verb> <itemList>
 *      <itemList> → <item> | <item> , <itemList> | <item> and <itemList>
 *      <item> → <category>
 *      <category> → <itemName>
 *
 */


/**<program> → <sentence>
     <sentence> → <subject> <verb> <item>
     <itemList> → <item>
     <item> → <boots> | <armor> | <weapon>
     <boots> → Berserker's Greaves | Mercury's Treads
     <armor> → Thornmail | Randuin's Omen
     <weapon> → Bloodthirster | Infinity Edge

     Sample output
     <program>
     ⇒ <sentence>
     ⇒ <subject> <Command> <itemList>
     ⇒ Ben built <item>
     ⇒ Ben built <boots>
     ⇒ Ben built Berserker's Greaves
     */


