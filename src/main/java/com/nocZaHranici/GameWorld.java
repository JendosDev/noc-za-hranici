package com.nocZaHranici;

import java.util.HashMap;
import java.util.Map;

public class GameWorld {
    private Map<String, Location> locations;
    private Location startLocation;

    public GameWorld() {
        this.locations = new HashMap<>();
    }

    public void loadFromJson(String path) {

    }

    public Location getStartLocation() {
        return startLocation;
    }

    public Location getLocation(String id) {
        return this.locations.get(id);
    }
}
