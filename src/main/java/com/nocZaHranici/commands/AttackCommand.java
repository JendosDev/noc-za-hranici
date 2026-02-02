package com.nocZaHranici.commands;

import com.nocZaHranici.NPC;
import com.nocZaHranici.Player;

public class AttackCommand implements Command {
    private Player player;

    public AttackCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute(String[] args) {
        if (args.length == 0) {
            System.out.println("Nezadal jsi postavu! Použij příkaz: utok <postava>");
            return;
        }

        String npcName = args[0];
        NPC npcToAttack = null;

        for (NPC npc : player.getCurrentLocation().getNpcs()) {
            if (npc.getName().equalsIgnoreCase(npcName)) {
                npcToAttack = npc;
                break;
            }
        }

        if (npcToAttack != null) {
            System.out.println("Útočíš na: " + npcToAttack.getName());
        } else {
            System.out.println("Taková postava zde není.");
        }
    }

}
