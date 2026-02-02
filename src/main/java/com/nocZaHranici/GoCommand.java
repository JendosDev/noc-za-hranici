package com.nocZaHranici;

public class GoCommand implements Command {
    private Player player;

    public GoCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute(String[] args) {
        if (args.length == 0) {
            System.out.println("Nezadal jsi směr! použij příkaz: jdi <směr>");
            return;
        }
        String target = args[0];
        Location currentLocation = player.getCurrentLocation();
        Location next = currentLocation.getConnection(target);

        if (next != null) {
            player.setCurrentLocation(next);
            System.out.println("Jsi nyní v: " + next.getName());
            System.out.println(next.getDescription());
        } else {
            System.out.println("Tímto směrem se pohybovat nemůžeš.");
        }
    }

}
