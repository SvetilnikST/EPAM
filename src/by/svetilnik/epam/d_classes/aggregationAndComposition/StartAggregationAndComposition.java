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
import by.svetilnik.epam.d_classes.aggregationAndComposition.task4.bankAccount.BankAccount;
import by.svetilnik.epam.d_classes.aggregationAndComposition.task4.client.Client;
import by.svetilnik.epam.d_classes.aggregationAndComposition.task4.client.ClientsList;
import by.svetilnik.epam.d_classes.aggregationAndComposition.task5.TravelVoucher;
import by.svetilnik.epam.d_classes.aggregationAndComposition.task5.TypeOfFoodOnTour;
import by.svetilnik.epam.d_classes.aggregationAndComposition.task5.TypeOfTransport;
import by.svetilnik.epam.d_classes.aggregationAndComposition.task5.TypeVoucher;

import java.util.ArrayList;

import static by.svetilnik.epam.d_classes.aggregationAndComposition.task4.bankAccount.BankAccountLogic.findAccount;
import static by.svetilnik.epam.d_classes.aggregationAndComposition.task4.bankAccount.BankAccountLogic.sortAccounts;
import static by.svetilnik.epam.d_classes.aggregationAndComposition.task4.bankAccount.BankView.printAccount;
import static by.svetilnik.epam.d_classes.aggregationAndComposition.task4.client.ClientLogic.*;
import static by.svetilnik.epam.d_classes.aggregationAndComposition.task4.client.ClientView.printClientInfo;

public class StartAggregationAndComposition {
    public static void start() {
//        task1();
//        task2();
//        task3();
//        task4();
        task5();
    }

    private static void task5() {

        //тип питания
        TypeOfFoodOnTour typeOfFoodOnTour1 = new TypeOfFoodOnTour("Все включено ");
        TypeOfFoodOnTour typeOfFoodOnTour2 = new TypeOfFoodOnTour("Только завтрак ");
        TypeOfFoodOnTour typeOfFoodOnTour3 = new TypeOfFoodOnTour("Завтрак и обед ");

        TravelVoucher travelVoucher1 = new TravelVoucher("Первый", TypeVoucher.Relaxation, TypeOfTransport.SHIP, typeOfFoodOnTour1);
        TravelVoucher travelVoucher2 = new TravelVoucher("Второй", TypeVoucher.Excursion, TypeOfTransport.BUS, typeOfFoodOnTour2);
        TravelVoucher travelVoucher3 = new TravelVoucher("Третий", TypeVoucher.Shopping, TypeOfTransport.CAR, typeOfFoodOnTour3);
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

    private static void task4() {

        BankAccount bankAccount1 = new BankAccount(1, 1005, 10, true);
        BankAccount bankAccount2 = new BankAccount(2, 1002, -100, true);
        BankAccount bankAccount3 = new BankAccount(3, 2013, 0, false);
        BankAccount bankAccount4 = new BankAccount(4, 2002, 200, true);

        ArrayList<BankAccount> bankAccountsFirst = new ArrayList<>();
        bankAccountsFirst.add(bankAccount1);
        bankAccountsFirst.add(bankAccount2);

        ArrayList<BankAccount> bankAccountsSecond = new ArrayList<>();
        bankAccountsSecond.add(bankAccount3);
        bankAccountsSecond.add(bankAccount4);

        Client clientOne = new Client(1, "TheFirst", bankAccountsFirst);
        Client clientTwo = new Client(2, "TheSecond", bankAccountsSecond);
        Client clientThree = new Client(2, "TheSecond");

        ArrayList<Client> clients = new ArrayList<>();
        clients.add(clientOne);
        clients.add(clientTwo);
        clients.add(clientThree);

        ClientsList clientsList = new ClientsList(clients);

        //поиск счета по номеру
        printAccount(findAccount(clientsList, 1002));
        //сортировка счетов по номеру
        printAccount(sortAccounts(clientsList));

        printClientInfo(clientOne);

        addAccount(clientOne, bankAccount4);
        printClientInfo(clientOne);

        deleteAccount(clientOne, 2002);
        printClientInfo(clientOne);

        editActiveAccount(clientOne, 1001, false);
        printClientInfo(clientOne);

        System.out.println("Sum positive accounts " + "Client " + clientOne.getFullName() + " = " + getPositiveSumAccount(clientOne));
        System.out.println("Sum negative accounts " + "Client " + clientOne.getFullName() + " = " + getNegativeSumAccounts(clientOne));
        System.out.println("Sum all accounts = " + getSumAllAccounts(clientOne));

        printClientInfo(clientOne);

    }

}
