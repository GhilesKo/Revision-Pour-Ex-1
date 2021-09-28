package org.example;

import java.io.*;
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
        //Trouverr("Cax");
        EcrireFichier();
        LireFichier("C:\\Users\\1584887\\IdeaProjects\\untitled1\\" + "filename.txt");


    }
    public static void Trouverr(String motCherche) throws Exception {

        Trouveru testTrouve = new Trouveru(objList,motCherche);
        int resultat = 0;
        resultat = testTrouve.TrouverIndex();
        System.out.println(resultat);
    }

    public static void EcrireFichier()
    {
        String path="";
        path+= System.getProperty("user.dir");
        //path = path.replace("\\", "\\\\");
        System.out.println(path+"\\hello.txt");

        try {
           // File myObj = new File(path+"\\Hello.txt");
            File myObj = new File(path);
            File Fichier = new File(myObj.getParentFile(),"Ghiles Kouaou.txt");


            System.out.println(Fichier.getParent());
            if (Fichier.createNewFile()) {
                System.out.println("File created: " + Fichier.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }

    public static void LireFichier(String Fichier) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(Fichier));
        String Texte="";
        while ((Texte = br.readLine()) != null) {
            System.out.println("-----------");
            System.out.println(Texte);
        }


    }



}
