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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<NPC> getNpcs() {
        return npcs;
    }

    public void setNpcs(List<NPC> npcs) {
        this.npcs = npcs;
    }

    public Map<String, Location> getConnections() {
        return connections;
    }

    public void setConnections(Map<String, Location> connections) {
        this.connections = connections;
    }

    public void addItem(Item item) {

    }

    public void addNpc(NPC npc) {

    }
}
