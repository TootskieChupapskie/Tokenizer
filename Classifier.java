public class Classifier {
    public static TokenType sentenceClassifier(String input) {
        if (input.contains(",") || input.contains(" and ")) {
            return TokenType.compound;
        }
        return TokenType.simple;
    }

    public static TokenType ItemClassifier(String item) {
        item = item.trim();

        if (Items.boots.contains(item)) return TokenType.boots;
        if (Items.armorPhysical.contains(item)) return TokenType.armorPhysical;
        if (Items.armorMagic.contains(item)) return TokenType.armorMagic;
        if (Items.weaponsAD.contains(item)) return TokenType.weaponAD;
        if (Items.weaponsAP.contains(item)) return TokenType.weaponAP;

        return TokenType.unknown;
    }

}