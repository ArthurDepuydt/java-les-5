package Pokemon;

import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    private final List<String> attacks = List.of("surf", "hydroPump", "hydroCanon", "rainDance");
    private static final String type = "water";

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public List<String> getAttacks() {
        return attacks;
    }

    public void surf(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with surf");
        int damage = switch (gymPokemon.getType()) {
            case "fire" -> 35;
            case "electric" -> 25;
            case "grass" -> 15;
            default -> 5;
        };
        System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
        gymPokemon.setHp(gymPokemon.getHp() - damage);
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " hp left");
    }

    public void hydroPump(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with hydroPump");
        int damage = switch (gymPokemon.getType()) {
            case "fire" -> 45;
            case "electric" -> 35;
            case "grass" -> 20;
            default -> 10;
        };
        System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
        gymPokemon.setHp(gymPokemon.getHp() - damage);
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " hp left");
    }

    public void hydroCanon(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with hydroCanon");
        int damage = switch (gymPokemon.getType()) {
            case "fire" -> 40;
            case "electric" -> 30;
            case "grass" -> 20;
            default -> 10;
        };
        System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
        gymPokemon.setHp(gymPokemon.getHp() - damage);
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " hp left");
    }

    public void rainDance(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with rainDance");
        int damage = 0;
        switch (gymPokemon.getType()) {
            case "electric" -> System.out.println("rainDance has no effect on " + gymPokemon.getName());
            case "grass" -> {
                int boost = 15;
                gymPokemon.setHp(gymPokemon.getHp() + boost);
                System.out.println(gymPokemon.getName() + " gains " + boost + " hp");
            }
            case "fire" -> damage = 30;
            default -> damage = 10;
        }
        if (damage > 0) {
            System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
            gymPokemon.setHp(gymPokemon.getHp() - damage);
        }
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " hp left");
    }
}
