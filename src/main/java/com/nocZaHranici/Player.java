package com.nocZaHranici;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Player {
    private Location currentLocation;
    private Inventory inventory;
    private List<Quest> quests;

    public Player(Location startLocation) {
        this.currentLocation = startLocation;
        this.inventory = new Inventory();
        this.quests = new ArrayList<>();
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Quest> getQuests() {
        return quests;
    }

    public void setQuests(List<Quest> quests) {
        this.quests = quests;
    }

//    public void go(String direction) {
//        Map<String, Location> exits = currentLocation.getConnections();
//
//        if (exits.containsKey(direction)) {
//            String nextId = exits.get(direction).getId();
//            Location next = gameWorld.getLocation(nextId);
//
//            if (next != null) {
//                currentLocation = next;
//                System.out.println(currentLocation.getName());
//                System.out.println(currentLocation.getDescription());
//            }
//        } else {
//            System.out.println("Tímto směrem se jít nedá.");
//        }
//    }
}
