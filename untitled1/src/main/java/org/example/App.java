package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
   static String[] objList=new String[]{"Bonjour","Monsieur","Monsieur","Ca","Va",};
    public static void main( String[] args ) throws Exception {
       Trouveru testTrouve = new Trouveru(objList,"Csa");
       int resultat = 0;
       resultat = testTrouve.TrouverIndex();
        System.out.println(resultat);
    }





}
