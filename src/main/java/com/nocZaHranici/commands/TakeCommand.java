package com.nocZaHranici.commands;

import com.nocZaHranici.Item;
import com.nocZaHranici.Player;

public class TakeCommand implements Command {
    private Player player;

    public TakeCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute(String[] args) {
        if (args.length == 0) {
            System.out.println("Nezadal jsi předmět! Použij příkaz: vezmi <předmět>");
            return;
        }

        String itemName = args[0];
        Item itemToTake = null;

        for (Item item : player.getCurrentLocation().getItems()) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                itemToTake = item;
                break;
            }
        }

        if (itemToTake != null) {
            player.getInventory().addItem(itemToTake);
            player.getCurrentLocation().getItems().remove(itemToTake);
            System.out.println("Sebral jsi: " + itemToTake.getName());
        } else {
            System.out.println("Takový předmět tu není.");
        }
    }
}
