
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tpedrero
 */
public class Main {

    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        SystemeExploitation se = new SystemeExploitation();

        int choix = 0;
        while (choix !=9){
            se.afficherInfo();
            se.afficherCommande();
            choix = getChoix(sc);
            se.envoyerCommande(choix);
        }
    }
    
    private static int getChoix(Scanner sc){
        System.out.println("\n Votre choix (9 pour quitter):");
        return sc.nextInt();
    }
}
