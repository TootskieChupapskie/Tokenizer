import java.util.ArrayList;
import java.util.List;

public class PrintPhases {

    /**
     * Summary: Contains the process where items are classified as they are printed for each phase
     *
     * @param input
     */

    public static void printPhaseOne(String input) {
        Tokens parsedTokens = Tokenizer.tokenize(input);
        System.out.println("Phase 1:");
        System.out.println(parsedTokens.getSubject() + " → <subject>");
        System.out.println(parsedTokens.getCommand() + " → <verb>");

        for (String item : InputHelper.extractItems(input)) {
            TokenType type = Classifier.ItemClassifier(item);
            System.out.println(item + " → <" + type.name() + ">");
        }
    }

    public static void printPhaseTwo(String subject, String command, String items) {
        System.out.println("\nPhase 2:");
        System.out.println("  <program>");
        System.out.println("→ <sentence>");
        System.out.println("→ <subject> <command> <itemList>");
        System.out.println("→ " + subject + " " + command + " <itemList>");


        List<String> itemList = InputHelper.extractItems(items);
        List<String> normalized = new ArrayList<>();
        for (String item : itemList) {
            normalized.add(item.toUpperCase().trim());
        }


        if (itemList.size() == 1) {
            expandItem(subject, command, itemList.get(0));
        } else {
            System.out.print("→ " + subject + " " + command + " ");
            for (int i = 0; i < itemList.size(); i++) {
                if (i > 0) {
                    if (i == itemList.size() - 1) {
                        System.out.print(", and ");
                    } else {
                        System.out.print(", ");
                    }
                }
                System.out.print("<item>");
            }
            System.out.println("; <sentence>");


            System.out.print("→ " + subject + " " + command + " ");
            for (int i = 0; i < itemList.size(); i++) {
                String item = itemList.get(i);
                String normalizedItem = item.toUpperCase().trim();
                TokenType type = Classifier.ItemClassifier(normalizedItem);

                if (i > 0) {
                    if (i == itemList.size() - 1) {
                        System.out.print(" ,and ");
                    } else {
                        System.out.print(", ");
                    }
                }
                System.out.print("<" + type.name() + ">");
            }
            System.out.println("; <sentence>");

            System.out.print("→ " + subject + " " + command + " ");
            for (int i = 0; i < itemList.size(); i++) {
                String item = itemList.get(i);

                if (i > 0) {
                    if (i == itemList.size() - 1) {
                        System.out.print(" ,and ");
                    } else {
                        System.out.print(", ");
                    }
                }
                System.out.print(item);
            }
            System.out.println("; <sentence>");
        }
    }


    private static void expandItem(String subject, String command, String item) {
        String normalizedItem = item.toUpperCase().trim();
        TokenType type = Classifier.ItemClassifier(normalizedItem);

        System.out.println("→ " + subject + " " + command + " <item> ; <sentence>");
        System.out.println("→ " + subject + " " + command + " <" + type.name() + "> ; <sentence>");
        System.out.println("→ " + subject + " " + command + " " + item + "; <sentence>");
    }
}
