import java.util.List;

public class Tokens {
    private String subject;
    private String command;
    private List<Tokens> itemList;
    //private String itemName;
    //private TokenType type;


    public Tokens(String subject, String command, List<Tokens> itemList){
        this.subject = subject;
        this.command = command;
        this.itemList = itemList;
    }

    public String getSubject() { return subject; }
    public String getCommand() { return command; }
    //public List<Tokens> getItems() { return itemList; }
    //public  TokenType ItemTokens(){ return type; }

}
