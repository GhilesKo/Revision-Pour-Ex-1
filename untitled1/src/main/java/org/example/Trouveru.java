package org.example;

import java.util.NoSuchElementException;

public class Trouveru
{
    static public String[] TabElement;
    static public  String elementRecherché;


    public Trouveru(String[] tabElement, String element) {
        this.TabElement = tabElement;
        this.elementRecherché = element;
    }

    public int TrouverIndex() throws Exception {

        for (int i = 0; i < TabElement.length  ; i++) {
            if (TabElement[i].equals(elementRecherché))
            { return i ;}

        }

        throw new NoSuchElementException("Mot pas trouvé");
    }



}
