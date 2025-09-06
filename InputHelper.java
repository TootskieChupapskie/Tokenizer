import java.util.ArrayList;
import java.util.List;

public class InputHelper {
    public static String extractVerb(String input){
        String[] knownVerbs = { "built", "bought", "sold", "upgraded" };
        String verb = null;
        int verbIndex = -1;

        for(String v: knownVerbs){
            int index = input.toLowerCase().indexOf(v);
            if (index != -1){
                verb = v;
                verbIndex = index;
                break;
            }
        }
        return verb;
    }

    public static String extractSubject(String input){
        String[] cut = input.split(" ");
        return cut[0];
    }

    public static List<String> extractItems(String input){
        List<String> items = new ArrayList<>();
        String verb = extractVerb(input);

        if (verb == null){
            return items;
        }

        int verbIndex = input.toLowerCase().indexOf(verb);
        int startofItems = verbIndex+ verb.length() + 1;

        String itemsString = input.substring(startofItems);

        String[] itemArr = itemsString.split(", | and ");

        for(String item: itemArr){
            items.add(item.trim());
        }
        return items;
    }
    public static List<String> Convert(String input){
        List<String> convertedInput = new ArrayList<>();
        convertedInput.add(extractSubject(input));
        convertedInput.add(extractVerb(input));
        convertedInput.addAll(extractItems(input));

        return convertedInput;
    }
}