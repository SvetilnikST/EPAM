package com.svetilnik.classes.aggregationAndComposition;

import com.svetilnik.classes.aggregationAndComposition.task1.Sentense;
import com.svetilnik.classes.aggregationAndComposition.task1.Text;
import com.svetilnik.classes.aggregationAndComposition.task1.Word;
import com.svetilnik.classes.aggregationAndComposition.task2.Car;
import com.svetilnik.classes.aggregationAndComposition.task2.Wheels;
import com.svetilnik.classes.aggregationAndComposition.task3.District;
import com.svetilnik.classes.aggregationAndComposition.task3.Region;
import com.svetilnik.classes.aggregationAndComposition.task3.State;
import com.svetilnik.classes.aggregationAndComposition.task3.Town;

import java.util.ArrayList;

import static com.svetilnik.classes.aggregationAndComposition.task3.State.*;

public class StartAggregationAndComposition {
    public static void start() {
//        task1();
        task3();
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

    public static void task2() {

        Wheels wheels = new Wheels();

        Car car = new Car();
        car.setMark("Opel");
        car.setGaselineVolume(40);
        car.setWheels(wheels);
    }

    public static void task3() {

        District districtOne = new District("Витебский");
        District districtTwo = new District("Полоцкий");
        District districtThree = new District("Минский");

        //создали города
        Town townOne = new Town("Витебск", districtOne);
        Town townTwo = new Town("Полоцк", districtTwo);
        Town townThree = new Town("Минск", districtThree);

        //создаем области Витебскую и добавили 2 города
        Region regionOne = new Region();
        regionOne.setNameRegion("Витебская область");
        regionOne.setAreaRegion(50.0);
        ArrayList<Town> townsVit = new ArrayList<>();
        townsVit.add(townOne);
        townsVit.add(townTwo);
        regionOne.setTowns(townsVit);

        //создали Минскую область добавили 1 город Минск
        Region regionTwo = new Region();
        regionTwo.setNameRegion("Минская область");
        regionTwo.setAreaRegion(50.0);
        ArrayList<Town> townsMin = new ArrayList<>();
        townsMin.add(townThree);
        regionTwo.setTowns(townsMin);

        //создали государство Беларусь и добавили два региона
        State belarus =  new State();
        belarus.setNameState("Belarus");
        belarus.setCapital(townThree);

        ArrayList<Region> regionsBel = new ArrayList<>();
        regionsBel.add(regionOne);
        regionsBel.add(regionTwo);

        belarus.setRegions(regionsBel);

        printNameState(belarus);
        printCapital(belarus);
        countRegion(belarus);
        printAreaState(belarus);
        printRegionsCenter(belarus);



    }

}
