import java.util.List;

public class Tokens {
    /**
     *
     * Summary: utilizes a constructor to create an instance that sets the values of the variables to be retrieved
     *
     */
    private String subject;
    private String command;
    private List<Tokens> itemList;

    public Tokens(String subject, String command, List<Tokens> itemList){
        this.subject = subject;
        this.command = command;
        this.itemList = itemList;
    }

    public String getSubject() { return subject; }
    public String getCommand() { return command; }
}
