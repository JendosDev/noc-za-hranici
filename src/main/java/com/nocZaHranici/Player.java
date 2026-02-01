package com.nocZaHranici;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Player {
    private GameWorld gameWorld;

    public Location getCurrentLocation() {
        return null;
    }

    private Location currentLocation;
    private Map<String, Location> locations = new HashMap<>();


    public void go(String direction) {
        Map<String, Location> exits = currentLocation.getConnections();

        if (exits.containsKey(direction)) {
            String nextId = exits.get(direction).getId();
            Location next = gameWorld.getLocation(nextId);

            if (next != null) {
                currentLocation = next;
                System.out.println(currentLocation.getName());
                System.out.println(currentLocation.getDescription());
            }
        } else {
            System.out.println("Tímto směrem se jít nedá.");
        }
    }

    public Inventory getInventory() {
        return null;
    }
}
