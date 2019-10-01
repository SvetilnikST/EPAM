package com.svetilnik.d_classes.aggregationAndComposition.task3;

import java.util.ArrayList;

public class State {

    private String nameState;
    private Town capital;
    private ArrayList<Region> regions;

    public State(String nameState, Town capital, ArrayList<Region> regions) {
        this.nameState = nameState;
        this.capital = capital;
        this.regions = regions;
    }

    public static void printNameState(State state) {
        System.out.println("State: " + state.getNameState());
    }

    public static void printCapital(State state) {
        System.out.println("Capital: " + state.getCapital().getNameTown());
    }

    public static void countRegion(State state) {
        System.out.println("Count region: " + state.getRegions().size());
    }

    public static void printAreaState(State state) {
        double areaState = 0.0;

        for (int i = 0; i < state.getRegions().size(); i++) {
            areaState = areaState + state.getRegions().get(i).getAreaRegion();
        }
        System.out.println("Area state: " + areaState);
    }

    public static void printRegionsCenter(State state) {
        System.out.println("Regions town: ");
        for (int i = 0; i < state.getRegions().size(); i++) {
            System.out.println((i + 1) + " " + state.getRegions().get(i).getNameRegonTown().getNameTown());
        }
    }

    public String getNameState() {
        return nameState;
    }

    public Town getCapital() {
        return capital;
    }

    public ArrayList<Region> getRegions() {
        return regions;
    }

}
