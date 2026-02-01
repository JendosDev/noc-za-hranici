package com.nocZaHranici;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameWorld {
    private Map<String, Location> locations;
    private Location startLocation;

    public GameWorld() {
        this.locations = new HashMap<>();
    }

    public void loadFromJson(String filePath) {
        Gson gson = new Gson();

        try (FileReader reader = new FileReader(filePath)) {
            WorldData data = gson.fromJson(reader, WorldData.class);

            for (Location location : data.getLocations()) {
                locations.put(location.getId(), location);
            }
        } catch (Exception e) {
            System.out.println("Chyba při načítání světa.");
        }
    }


    public Location getStartLocation() {
        return startLocation;
    }

    public Location getLocation(String id) {
        return this.locations.get(id);
    }
}
