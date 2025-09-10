public class Classifier {
    /**
     *
     * Summary: This classifies the Items by referencing ItemList and setting the appropriate category
     * for the item inputted.
     * If the item is not on the list it is listed as unknown
     *
     */
    public static TokenType ItemClassifier(String item) {
        item = item.toUpperCase().trim();

        if (ItemList.boots.contains(item)) return TokenType.boots;
        if (ItemList.armorPhysical.contains(item)) return TokenType.armorPhysical;
        if (ItemList.armorMagic.contains(item)) return TokenType.armorMagic;
        if (ItemList.weaponsAD.contains(item)) return TokenType.weaponAD;
        if (ItemList.weaponsAP.contains(item)) return TokenType.weaponAP;

        return TokenType.unknown;
    }
}
