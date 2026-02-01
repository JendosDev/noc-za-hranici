package com.nocZaHranici;

public class Game {

    private GameWorld gameWorld;
    private Player player;
    private Location currentLocation;

    public Game(GameWorld gameWorld, Location currentLocation) {
        this.gameWorld = gameWorld;
        this.player = new Player();
        this.currentLocation = currentLocation;
    }

    public void start() {
        gameWorld.loadFromJson("world.json");
        currentLocation = gameWorld.getLocation("vesnice");

        printCurrentLocation();
    }


    public void processInput(String input) {

    }

    private void printCurrentLocation() {
        System.out.println(currentLocation.getName());
        System.out.println(currentLocation.getDescription());
    }

    public boolean isRunning() {
        return false;
    }
}
