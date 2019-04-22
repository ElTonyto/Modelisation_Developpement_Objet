import spawn.*;
import spawn.orkoide.Goblin;
import spawn.orkoide.Ork;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]){

        genereTribut();
        genereTributClone();
    }

    private static void genereTribut() {

        List<Monstre> tribut = new ArrayList<Monstre>();

        for (int x = 0; x < 5; x++)
            tribut.add(new Ork());
        for (int x = 0; x < 3; x++)
            tribut.add(new Goblin("Evil Sunz"));

        for(Monstre orkoide : tribut)
            System.out.println(orkoide);
    }

    private static void genereTributClone() {

        SpawnerOrkoide spawner = new SpawnerOrkoide();
        List<Monstre> tribut = new ArrayList<Monstre>();

        Ork ork = spawner.spawnOrk();
        System.out.println(ork.getClass());
        System.out.println(ork);

        for (int x = 0; x < 1000; x++)
            tribut.add(spawner.spawnOrk());
        for (int x = 0; x < 5000; x++)
            tribut.add(spawner.spawnGoblin());

        for(Monstre orkoide : tribut)
            System.out.println(orkoide);
    }
}
