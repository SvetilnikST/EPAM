package by.svetilnik.epam.d_classes.aggregationAndComposition.task1;

public class Sentense {
    private String sentense = "";

    public void addWord(Word word) {
        sentense += " "+word.getWord();
    }

    public String getSentense() {
        return sentense;
    }
}
