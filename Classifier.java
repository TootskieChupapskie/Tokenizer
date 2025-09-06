public class Classifier {
    public static TokenType sentenceClassifier(String input) {
        if (input.contains(",") || input.contains(" and ")) {
            return TokenType.compound;
        }else if(input.matches(".*\\b(bought|purchased|built|acquired)\\b.*")){
            return TokenType.command;
        } else if(input.matches("^[A-Z][a-z]+(?: [A-Z][a-z]+)*$\n")) {
            return TokenType.subject;
        } else if(Items.boots.contains(input) ||
                Items.armorPhysical.contains(input) ||
                Items.armorMagic.contains(input) ||
                Items.weaponsAD.contains(input) ||
                Items.weaponsAP.contains(input))
        {
            return TokenType.item;
        }
        return TokenType.simple;
    }

    public static TokenType ItemClassifier(String item) {
        item = item.toUpperCase().trim();

        if (Items.boots.contains(item)) return TokenType.boots;
        if (Items.armorPhysical.contains(item)) return TokenType.armorPhysical;
        if (Items.armorMagic.contains(item)) return TokenType.armorMagic;
        if (Items.weaponsAD.contains(item)) return TokenType.weaponAD;
        if (Items.weaponsAP.contains(item)) return TokenType.weaponAP;

        return TokenType.unknown;
    }

}
