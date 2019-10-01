package com.svetilnik.classes.aggregationAndComposition.task3;

import java.util.ArrayList;

//государство
public class State {

    private String nameState;
    private Town capital;
    private ArrayList<Region> regions = new ArrayList<>();

    public State() {
    }

    public State(String nameState, Town capital, ArrayList<Region> regions) {
        this.nameState = nameState;
        this.capital = capital;
        this.regions = regions;
    }

    public static void printNameState(State state){
        System.out.println("State: "+state.getNameState());
    }

    //вывести на консоль столицу
    public static void printCapital(State state) {
        System.out.println("Capital: " + state.getCapital().getNameTown());
    }

    //вывести количество областей
    public static void countRegion(State state) {
        System.out.println("Count region: " + state.getRegions().size());
    }

    //вывести площадь, рассчитать в зависимости от плозщади областей
    public static void printAreaState(State state) {
        double areaState=0.0;

        for (int i = 0; i < state.getRegions().size(); i++) {
            areaState = areaState+state.getRegions().get(i).getAreaRegion();
        }
        System.out.println("Area state: "+ areaState);
    }

    //вывести название областных центров - не областей, а именно Города
    public static void printRegionsCenter(State state) {
        System.out.println("Regions: ");
        for (int i = 0; i < state.getRegions().size(); i++) {
            System.out.println((i+1)+" "+state.getRegions().get(i).getNameRegion());
        }

    }


    public String getNameState() {
        return nameState;
    }

    public void setNameState(String nameState) {
        this.nameState = nameState;
    }

    public Town getCapital() {
        return capital;
    }

    public void setCapital(Town capital) {
        this.capital = capital;
    }

    public ArrayList<Region> getRegions() {
        return regions;
    }

    public void setRegions(ArrayList<Region> regions) {
        this.regions = regions;
    }
}
