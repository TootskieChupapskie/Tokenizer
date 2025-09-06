import java.util.ArrayList;
import java.util.List;

public class ActualTokenizer {
    public static Tokens tokenize(String input) {
        String verb = InputHelper.extractVerb(input);
        String subject = InputHelper.extractSubject(input);
        List<String> rawItems = InputHelper.extractItems(input);

        List<Tokens> itemTokens = new ArrayList<>();
        for (String item : rawItems) {
            TokenType type = Classifier.ItemClassifier(item);
            ItemToken itemToken = new ItemToken(item, type);
            itemTokens.add(itemToken);
        }

        return new Tokens(subject, verb, itemTokens);
    }
}

