package com.nocZaHranici;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

public class GameWorldLoader {
    public static List<Location> loadLocations(String filepath) {
        try (FileReader reader = new FileReader(filepath)) {
            Gson gson = new Gson();
            Type locationListType = new TypeToken<List<Location>>(){}.getType();
            return gson.fromJson(reader, locationListType);
        } catch (Exception e) {
            throw new RuntimeException("Nepodařilo se načíst svět ze souboru", e);
        }
    }
}
