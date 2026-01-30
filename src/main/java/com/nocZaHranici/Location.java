package com.nocZaHranici;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Location {
    private String id;
    private String name;
    private String description;

    private List<Item> items;
    private List<NPC> npcs;
    private Map<String, Location> connections;

    public Location(String id, String name, String description, List<Item> items, List<NPC> npcs) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.items = items;
        this.npcs = npcs;
        this.connections = new HashMap<>();
    }

    public void addLocation(String direction, Location target) {
        this.connections.put(direction, target);
    }

    public Location getConnection(String direction) {
        return this.connections.get(direction);
    }

    public String getDescription() {
        return null;
    }

    public Map<String, Location> getExits() {
        return null;
    }

    public void addItem(Item item) {

    }

    public void addNpc(NPC npc) {

    }
}
