package com.nocZaHranici.commands;

import com.nocZaHranici.Player;

public class QuestCommand implements Command {
    private Player player;

    public QuestsCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute(String[] args) {
        if (player.getQuests().isEmpty()) {
            System.out.println("Nemáš žádné aktivní úkoly.");
        } else {
            System.out.println("Aktivní úkoly:");
            player.getQuests().forEach(q ->
                    System.out.println("- " + q.getName() + ": " + q.getStatus())
            );
        }
    }
}
