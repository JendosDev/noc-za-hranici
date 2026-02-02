package com.nocZaHranici;

import java.util.Map;

public class Game {

    private GameWorld gameWorld;
    private Player player;
    private Location currentLocation;

    public Game(Location currentLocation) {
        this.gameWorld = new GameWorld();
        gameWorld.loadFromJson("locations.json");
        Location start = gameWorld.getLocation("vesnice");

        this.player = new Player(start);
    }

    public void start() {
        gameWorld.loadFromJson("world.json");
        currentLocation = gameWorld.getLocation("vesnice");

        printCurrentLocation();
    }

    public void go(String target) {
        Location currentLocation = player.getCurrentLocation();
        Map<String, Location> exits = currentLocation.getConnections();

        if (exits.containsKey(target)) {
            Location next = exits.get(target);
            player.setCurrentLocation(next);

            System.out.println("Jsi nyní v: " + next.getName());
            System.out.println(next.getDescription());
        } else {
            System.out.println("Tímto směrem se pohybovat nemůžeš.");
        }
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
