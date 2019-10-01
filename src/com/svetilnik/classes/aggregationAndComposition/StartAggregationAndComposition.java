package com.svetilnik.classes.aggregationAndComposition;

import com.svetilnik.classes.aggregationAndComposition.task1.Sentense;
import com.svetilnik.classes.aggregationAndComposition.task1.Text;
import com.svetilnik.classes.aggregationAndComposition.task1.Word;

public class StartAggregationAndComposition {
    public static void start() {
        task1();
    }

    public static void task1() {
        Word header = new Word("Aгрегация");

        Word word1 = new Word("Создать");
        Word word2 = new Word("объект");
        Word word3 = new Word("класса");
        Word word4 = new Word("Текст");

        Sentense sentenseOne = new Sentense();
        sentenseOne.addWord(word1);
        sentenseOne.addWord(word2);
        sentenseOne.addWord(word3);
        sentenseOne.addWord(word4);

        Sentense sentenseTwo = new Sentense();
        sentenseTwo.addWord(word1);
        sentenseTwo.addWord(word2);
        sentenseTwo.addWord(word3);
        sentenseTwo.addWord(word4);

        Text text = new Text(header);

        text.addBody(sentenseOne);
        text.addBody(sentenseTwo);

        text.printHeader(text);
        text.printBody(text);
    }

}
