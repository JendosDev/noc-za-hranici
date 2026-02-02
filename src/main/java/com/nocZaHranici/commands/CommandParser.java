package com.nocZaHranici.commands;

import com.nocZaHranici.Location;
import com.nocZaHranici.Player;

import java.util.Map;
import java.util.Scanner;

public class CommandParser {
    private Map<String, Command> commands; // mapa všech příkazů
    private Scanner scanner;

    public CommandParser(Map<String, Command> commands) {
        this.commands = commands;
        this.scanner = new Scanner(System.in);
    }

    /**
     * Hlavní metoda, která spouští příkazy.
     * Čte vstupy od hráče, hledá příkaz a spouští ho.
     */
    public void run() {
        System.out.println("Vítej ve hře! Napiš 'napoveda' pro seznam příkazů.");

        while (true) {
            System.out.print("> "); // prompt pro hráče
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                continue; // ignorujeme prázdný vstup
            }

            String[] parts = input.split(" ");
            String cmdName = parts[0].toLowerCase(); // název příkazu
            String[] args = new String[parts.length - 1]; // argumenty
            System.arraycopy(parts, 1, args, 0, args.length);

            Command command = commands.get(cmdName);
            if (command != null) {
                command.execute(args); // spustíme příkaz
            } else {
                System.out.println("Neznámý příkaz. Napiš 'napoveda' pro seznam příkazů.");
            }
        }
    }


    public Command parse(String input) {
        return null;
    }
}
