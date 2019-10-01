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
//        task3();
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

        Town townNovop = new Town("Novopolotsk");
        Town townPol = new Town("Polotsk");
        Town townMin = new Town("Minsk");
        Town townVit = new Town("Vitebsk");

        ArrayList<Town> townsRegionPol = new ArrayList<>();
        townsRegionPol.add(townNovop);
        townsRegionPol.add(townPol);

        ArrayList<Town> townsRegionMin = new ArrayList<>();
        townsRegionMin.add(townMin);

        ArrayList<Town> townsRegionVit = new ArrayList<>();
        townsRegionVit.add(townVit);

        District districtPol = new District("Polotsk district",townsRegionPol);
        District districtMin = new District("Minsk district",townsRegionMin);
        District districtVit = new District("Vitebsk district",townsRegionVit);

        ArrayList<District> districtsVit = new ArrayList<>();
        districtsVit.add(districtPol);
        districtsVit.add(districtVit);

        ArrayList<District> districtsMin = new ArrayList<>();
        districtsMin.add(districtMin);


        Region regionVit = new Region("Vitebsk region",townVit,50.0,districtsVit);
        Region regionMin = new Region("Minsk region",townMin,100.0,districtsMin);

        ArrayList<Region> regionsBel = new ArrayList<>();
        regionsBel.add(regionVit);
        regionsBel.add(regionMin);

        State belarus = new State("Belarus",townMin,regionsBel);

        printNameState(belarus);
        printCapital(belarus);
        countRegion(belarus);
        printAreaState(belarus);
        printRegionsCenter(belarus);
    }

}
