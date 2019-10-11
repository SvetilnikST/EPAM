package by.svetilnik.epam.a_basics;

public class StartBasics {
    public static void startBasics(){
        LinearPrograms.linearTask1(4, 3, 3);
        LinearPrograms.linearTask2(1.0, 0.0, 0.0);
        LinearPrograms.linearTask3(1.0, 3.5);
        LinearPrograms.linearTask4(378.651);
        LinearPrograms.linearTask5(8000);
        System.out.println("Linear task_6 Result: " + LinearPrograms.linearTask6(1.1, 1.2));
        System.out.println();

        Branching.branchingTask1(90, 30);
        Branching.branchingTask2(1,2,3,4);
        Branching.branchingTask3(1,2,3,4,5,6);
        Branching.branchingTask4(10,20,3,4,5);
        System.out.println("Branching task_5 Result:"+Branching.branchingTask5(2));
        System.out.println();

        Cycles.cyclesTask1();
        Cycles.cyclesTask2(1,10,1);
        Cycles.cyclesTask3();
        Cycles.cyclesTask4();
        Cycles.cyclesTask5(-3.0,4);
        Cycles.cyclesTask6();
        System.out.println();
        Cycles.cyclesTask7(1,50);
        System.out.println();
        Cycles.cyclesTask8(123456,154863);
    }
}
