package by.svetilnik.epam.a_basics;

public class StartBasics {
    public static void startBasics() {

        System.out.println("Basic:");
        System.out.println("Task_1: " + LinearPrograms.task1(4, 3, 3));
        LinearPrograms.task2(1.0, 0.0, 0.0);
        LinearPrograms.task3(1.0, 3.5);
        System.out.println("Task_4: " + LinearPrograms.task4(378.651));
        LinearPrograms.task5(8000);
        System.out.println("Task_6: " + LinearPrograms.linearTask6(1.1, 1.2));
        System.out.println();

        System.out.println("Branching:");
        System.out.print("Task_1: ");
        Branching.task1(90, 30);
        System.out.println("Task_2: " + Branching.task2(1, 2, 3, 4));
        System.out.println("Task_3: " + Branching.task3(1, 2, 3, 4, 5, 6));
        System.out.println("Task_4: " + Branching.task4(10,20,3,4,5));
        System.out.println("Task_5: "+Branching.task5(2));
        System.out.println();
//
//        Cycles.cyclesTask1();
//        Cycles.cyclesTask2(1,10,1);
//        Cycles.cyclesTask3();
//        Cycles.cyclesTask4();
//        Cycles.cyclesTask5(-3.0,4);
//        Cycles.cyclesTask6();
//        System.out.println();
//        Cycles.cyclesTask7(1,50);
//        System.out.println();
//        Cycles.cyclesTask8(123456,154863);
    }
}
