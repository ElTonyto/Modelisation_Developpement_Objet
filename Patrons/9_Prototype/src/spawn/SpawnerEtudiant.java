/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spawn;

import spawn.etudiant.Procrastinateur;
import spawn.etudiant.Tryhardeur;
import spawn.etudiant.Lambda;


/**
 *
 * @author tpedrero
 */
public class SpawnerEtudiant extends Spawner{
    
    public SpawnerEtudiant(){}

    @Override
    protected final void chargerMonstres() {

        ajouterMonstre(Procrastinateur.class, new Procrastinateur("2h/sem"));
        ajouterMonstre(Tryhardeur.class, new Tryhardeur("5h/nuit"));
        ajouterMonstre(Lambda.class, new Lambda("10pts"));
    }

    public Procrastinateur spawnProcrastinateur(){

        return (Procrastinateur)spawnMonstre(Procrastinateur.class);
    }

    public Tryhardeur spawnTryhardeur(){

        return (Tryhardeur)spawnMonstre(Tryhardeur.class);
    }
    
    public Lambda spawnLambda(){

        return (Lambda)spawnMonstre(Lambda.class);
    }
}
