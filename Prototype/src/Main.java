import spawn.*;
import spawn.orkoide.Goblin;
import spawn.orkoide.Ork;

import java.util.ArrayList;
import java.util.List;
import spawn.etudiant.Lambda;
import spawn.etudiant.Procrastinateur;
import spawn.etudiant.Tryhardeur;

public class Main {

    public static void main(String args[]){

        genereTribut();
        genereTributClone();
        System.out.println("===============================================");
        genereEtudiant();
        genereEtudiantClone();
    }

    private static void genereTribut() {

        List<Monstre> tribut = new ArrayList<Monstre>();

        for (int x = 0; x < 3; x++)
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

        for (int x = 0; x < 10; x++)
            tribut.add(spawner.spawnOrk());
        for (int x = 0; x < 50; x++)
            tribut.add(spawner.spawnGoblin());

        for(Monstre orkoide : tribut)
            System.out.println(orkoide);
    }
    
    private static void genereEtudiant () {
        List<Monstre> classe = new ArrayList<Monstre>();
        
        for (int x = 0; x < 3; x++)
            classe.add(new Procrastinateur("Peu"));
        for (int x = 0; x < 3; x++)
            classe.add(new Tryhardeur("Pas assez"));
        for (int x = 0; x < 5; x++)
            classe.add(new Lambda("Le jeudi soir"));
        
        for(Monstre etudiant : classe)
            System.out.println(etudiant);
    }
    
    private static void genereEtudiantClone() {

        SpawnerEtudiant spawner = new SpawnerEtudiant();
        List<Monstre> classe = new ArrayList<Monstre>();

        for (int x = 0; x < 10; x++)
            classe.add(spawner.spawnProcrastinateur());
        for (int x = 0; x < 10; x++)
            classe.add(spawner.spawnTryhardeur());
        for (int x = 0; x < 50; x++)
            classe.add(spawner.spawnLambda());
        
        for(Monstre etudiant : classe)
            System.out.println(etudiant);
    }
}
