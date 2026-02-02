package com.nocZaHranici.commands;

public class HelpCommand implements Command {

    @Override
    public void execute(String[] args) {
        System.out.println("Dostupné příkazy:");
        System.out.println("jdi <směr> - přesuň se do jiné lokace");
        System.out.println("vezmi <předmět> - seber předmět z lokace");
        System.out.println("pouzij <předmět> - použij předmět z inventáře");
        System.out.println("mluv <postava> - zahaj dialog s NPC");
        System.out.println("prozkoumej <objekt> - prozkoumej okolí nebo objekt");
        System.out.println("inventar - zobraz svůj inventář");
        System.out.println("utok <postava> - zaútoč na NPC");
        System.out.println("ukoly - zobraz seznam aktivních úkolů");
        System.out.println("napoveda - zobraz tento seznam příkazů");
    }
}
