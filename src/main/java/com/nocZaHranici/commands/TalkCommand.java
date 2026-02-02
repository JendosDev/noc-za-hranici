package com.nocZaHranici.commands;

import com.nocZaHranici.NPC;
import com.nocZaHranici.Player;

public class TalkCommand implements Command {
    private Player player;

    public TalkCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute(String[] args) {
        if (args.length == 0) {
            System.out.println("Nezadal jsi postavu! Použij příkaz: mluv <postava>");
            return;
        }

        String npcName = args[0];
        NPC npcToTalk = null;

        for (NPC npc : player.getCurrentLocation().getNpcs()) {
            if (npc.getName().equalsIgnoreCase(npcName)) {
                npcToTalk = npc;
                break;
            }
        }

        if (npcToTalk != null) {
            System.out.println("Mluvíš s " + npcToTalk.getName());
            // TODO: logika dialogu
        } else {
            System.out.println("Taková postava zde není.");
        }
    }
}
