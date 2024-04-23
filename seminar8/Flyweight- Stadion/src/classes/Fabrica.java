package classes;

import java.util.HashMap;
import java.util.Map;

public class Fabrica {
    private Map<String, Flyweight> spectatori;

    public Fabrica() {
        this.spectatori = new HashMap<>();
    }

    public Flyweight getSpectator(int inaltime, int latime) {
        String cheie = "" + inaltime + " " + latime;
        Flyweight flyweight = spectatori.get(cheie);
        if (flyweight == null) {
            flyweight = new Spectator(inaltime, latime);
            spectatori.put(cheie, flyweight);
        }
        return flyweight;
    }

}
