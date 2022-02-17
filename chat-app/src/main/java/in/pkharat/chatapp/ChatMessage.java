package in.pkharat.chatapp;

public class ChatMessage {

    private String From;

    private String Text;
    private String Recipient;

    public ChatMessage(String from, String text, String recipient) {
        From = from;
        Text = text;
        Recipient = recipient;
    }

    public String getFrom() {
        return From;
    }

    public void setFrom(String from) {
        From = from;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public String getRecipient() {
        return Recipient;
    }

    public void setRecipient(String recipient) {
        Recipient = recipient;
    }
}
