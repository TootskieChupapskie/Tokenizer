public class ItemToken extends Tokens {
    private String itemName;
    private TokenType type;

    public ItemToken(String itemName, TokenType type) {
        super(null,null,null);
        this.itemName = itemName;
        this.type = type;
    }

    public String getItemName() { return itemName; }
    public TokenType getType() { return type; }
}
