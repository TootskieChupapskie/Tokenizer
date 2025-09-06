import java.util.List;

public class Tokens {
    private String subject;
    private String verb;
    private List<Tokens> itemList;
    //private String itemName;
    //private TokenType type;


    public Tokens(String subject, String verb, List<Tokens> itemList){
        this.subject = subject;
        this.verb = verb;
        this.itemList = itemList;
    }

    public String getSubject() { return subject; }
    public String getVerb() { return verb; }
    //public List<Tokens> getItems() { return itemList; }
    //public  TokenType ItemTokens(){ return type; }

}