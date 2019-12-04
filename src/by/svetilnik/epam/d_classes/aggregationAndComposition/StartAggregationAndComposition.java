package by.svetilnik.epam.d_classes.aggregationAndComposition;

import by.svetilnik.epam.d_classes.aggregationAndComposition.task1.Sentense;
import by.svetilnik.epam.d_classes.aggregationAndComposition.task1.Text;
import by.svetilnik.epam.d_classes.aggregationAndComposition.task1.Word;
import by.svetilnik.epam.d_classes.aggregationAndComposition.task2.Car;
import by.svetilnik.epam.d_classes.aggregationAndComposition.task2.Engine;
import by.svetilnik.epam.d_classes.aggregationAndComposition.task2.Wheel;
import by.svetilnik.epam.d_classes.aggregationAndComposition.task3.District;
import by.svetilnik.epam.d_classes.aggregationAndComposition.task3.Region;
import by.svetilnik.epam.d_classes.aggregationAndComposition.task3.State;
import by.svetilnik.epam.d_classes.aggregationAndComposition.task3.Town;
import by.svetilnik.epam.d_classes.aggregationAndComposition.task4.BankAccount;
import by.svetilnik.epam.d_classes.aggregationAndComposition.task4.Client;

import java.util.ArrayList;

import static by.svetilnik.epam.d_classes.aggregationAndComposition.task4.ClientLogic.addAccount;
import static by.svetilnik.epam.d_classes.aggregationAndComposition.task4.ClientLogic.deleteAccount;
import static by.svetilnik.epam.d_classes.aggregationAndComposition.task4.ClientLogic.editActiveAccount;
import static by.svetilnik.epam.d_classes.aggregationAndComposition.task4.ClientView.printClientInfo;

public class StartAggregationAndComposition {
    public static void start() {
//        task1();
//        task2();
//        task3();

        task4();

    }

    private static void task4() {

        BankAccount bankAccount1 = new BankAccount(1, 1001, 10, true);
        BankAccount bankAccount2 = new BankAccount(2, 1002, 100, true);
        BankAccount bankAccount3 = new BankAccount(1, 2001, 0, false);
        BankAccount bankAccount4 = new BankAccount(2, 2002, 200, true);

        ArrayList<BankAccount> bankAccountsFirst = new ArrayList<>();
        bankAccountsFirst.add(bankAccount1);
        bankAccountsFirst.add(bankAccount2);

        ArrayList<BankAccount> bankAccountsSecond = new ArrayList<>();
        bankAccountsSecond.add(bankAccount3);
        bankAccountsSecond.add(bankAccount4);

        Client clientOne = new Client(1, "TheFirst", bankAccountsFirst);
        Client clientTwo = new Client(2, "TheSecond", bankAccountsSecond);
        Client clientThree = new Client(2, "TheSecond");
        //добавим аккаунт клиенту
//        addAccount(clientOne,)

        boolean active = false;

        printClientInfo(clientOne);
        //добавили счет
        addAccount(clientOne, bankAccount4);
        printClientInfo(clientOne);

        //удалили счет с определенным
        deleteAccount(clientOne, 2002);

        printClientInfo(clientOne);
//        printClientInfo(clientThree);
//        editActiveAccount(clientOne, 1001, active);


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

        Engine engine = new Engine("Super");
        Wheel wheel = new Wheel("Michelin", 13);
        Wheel wheelM = new Wheel("Bridgestone", 14);

        ArrayList<Wheel> wheels = new ArrayList<>();
        wheels.add(wheel);
        wheels.add(wheel);
        wheels.add(wheel);
        wheels.add(wheel);

        int counteGas = 30;

        Car car = new Car("BMW", engine, wheels, 30, 0);

        car.runCar();

        car.fillTheCar(car, counteGas);

        car.runCar();

        int numberWheel = 2;
        car.replaceWheel(numberWheel, wheelM);

        car.prinMark();
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

        District districtPol = new District("Polotsk district", townsRegionPol);
        District districtMin = new District("Minsk district", townsRegionMin);
        District districtVit = new District("Vitebsk district", townsRegionVit);

        ArrayList<District> districtsVit = new ArrayList<>();
        districtsVit.add(districtPol);
        districtsVit.add(districtVit);

        ArrayList<District> districtsMin = new ArrayList<>();
        districtsMin.add(districtMin);


        Region regionVit = new Region("Vitebsk region", townVit, 50.0, districtsVit);
        Region regionMin = new Region("Minsk region", townMin, 100.0, districtsMin);

        ArrayList<Region> regionsBel = new ArrayList<>();
        regionsBel.add(regionVit);
        regionsBel.add(regionMin);

        State belarus = new State("Belarus", townMin, regionsBel);

        State.printNameState(belarus);
        State.printCapital(belarus);
        State.countRegion(belarus);
        State.printAreaState(belarus);
        State.printRegionsCenter(belarus);
    }

}
