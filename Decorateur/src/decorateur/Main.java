/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorateur;

import java.util.ArrayList;

/**
 *
 * @author tpedrero
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Malbouffe> malbouffes = new ArrayList<>();
        
        McDo mcDo = new McDo();
        HotDog hotDog = new HotDog();
        Poutine poutine = new Poutine();
        
        System.out.println();
        malbouffes.add(poutine);
        malbouffes.add(hotDog);
        malbouffes.add(mcDo);
        
        malbouffes.add( new Sauce(poutine));
        malbouffes.add(new Sauce(mcDo));
        malbouffes.add(new Ketchup(hotDog));
        malbouffes.add(new Ketchup(mcDo));
        
        for( Malbouffe malbouffe : malbouffes){
            System.out.println(malbouffe.getDescription());
        }
    }
    
}
