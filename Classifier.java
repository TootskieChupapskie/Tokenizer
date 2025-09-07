public class Classifier {
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
