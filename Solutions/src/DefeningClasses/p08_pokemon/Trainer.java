package DefeningClasses.p08_pokemon;

import java.util.List;
import java.util.Map;

public class Trainer {
    private String name;
    private int badgesCount;
    private Map<String,List<Pokemon>> pokemons;
    private int pokemonsCount;

    Trainer(String name, Map<String, List<Pokemon>> pokemons) {
        this.name = name;
        this.badgesCount = 0;
        this.pokemons = pokemons;
        this.pokemonsCount = 0;
    }

    int getPokemonsCount() {
        return pokemonsCount;
    }

    void setPokemonsCount(int pokemonsCount) {
        this.pokemonsCount = pokemonsCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int getBadgesCount() {
        return badgesCount;
    }

    void setBadgesCount(int badgesCount) {
        this.badgesCount = badgesCount;
    }

    Map<String, List<Pokemon>> getPokemons() {
        return pokemons;
    }

    public void setPokemons(Map<String, List<Pokemon>> pokemons) {
        this.pokemons = pokemons;
    }

    @Override
    public String toString() {
        return String.format("%s %d %d",this.name,
                this.badgesCount,
                this.pokemonsCount);
    }
}
