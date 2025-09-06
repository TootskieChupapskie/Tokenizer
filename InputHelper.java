import java.util.ArrayList;
import java.util.List;

public class InputHelper {
    public static String extractCommand(String input){
        String[] knownCommands = { "built", "bought", "sold", "upgraded" , "acquired"};
        String command = null;
        int verbIndex = -1;

        for(String v: knownCommands){
            int index = input.toLowerCase().indexOf(v);
            if (index != -1){
                command = v;
                verbIndex = index;
                break;
            }
        }
        return command;
    }

    public static String extractSubject(String input){
        String[] cut = input.split(" ");
        return cut[0];
    }

    public static List<String> extractItems(String input){
        List<String> items = new ArrayList<>();
        String verb = extractCommand(input);

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
        convertedInput.add(extractCommand(input));
        convertedInput.addAll(extractItems(input));

        return convertedInput;
    }
}
