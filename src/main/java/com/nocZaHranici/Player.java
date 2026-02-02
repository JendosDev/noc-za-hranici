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
}
