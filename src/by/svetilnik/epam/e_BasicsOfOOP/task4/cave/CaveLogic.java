package by.svetilnik.epam.e_BasicsOfOOP.task4.cave;

import by.svetilnik.epam.d_classes.aggregationAndComposition.task2.Car;
import by.svetilnik.epam.e_BasicsOfOOP.task4.Treasure;

public class CaveLogic {

    public static void setTreasure(Cave cave) {

        Treasure[] treasures = new Treasure[100];
        int count = 10;
        for (int i = 0; i < treasures.length - 1; i++) {
            treasures[i] = new Treasure(i, "Treasure" + " " + (i + 1), 10 + count);
            count += 10;
        }

        cave.setTreasures(treasures);
    }

    public static int findMaxCost(Cave cave) {
        int max = cave.getTreasures()[0].getCost();
        int indMax = 0;

        for (int i = 0; i < cave.getTreasures().length - 1; i++) {
            if (cave.getTreasures()[i].getCost() > max) {
                max = cave.getTreasures()[i].getCost();
                indMax = i;
            }
        }

        if (indMax != 0) {
            return indMax;
        } else
            return 0;

    }

    public static void setTreasuresForGivenAmount(Cave cave, int sum) {

        //возможно сначала отсортировать по возрастанию

        //искать числа сумма которых дает это число

        int summa = 0;


        while (summa != sum && summa < sum) {
            //ищем варианты


        }


    }

}
