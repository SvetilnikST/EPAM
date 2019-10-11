package by.svetilnik.epam.d_classes.aggregationAndComposition.task1;

public class Text {
    private String header;
    private String body = "";

    public Text(Word word) {
        header = word.getWord();
    }

    public Text(Sentense sentense) {
        header = sentense.getSentense();
    }

    public String getHeader() {
        return header;
    }

    public void addBody(Word word) {
        body += " " + word.getWord();
    }

    public void addBody(Sentense sentense) {
        body += sentense.getSentense()+".";
    }

    public String getBody() {
        return body;
    }

    public void printHeader(Text text) {
        System.out.println("Head:" + text.getHeader());
    }

    public void printBody(Text text) {
        System.out.println("Body:" + text.getBody());
    }
}
