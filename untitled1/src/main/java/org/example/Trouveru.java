package org.example;

import java.util.NoSuchElementException;

public class Trouveru
{
    static public String[] TabElement;
    static public  String elementRecherch√©;


    public Trouveru(String[] tabElement, String element) {
        this.TabElement = tabElement;
        this.elementRecherch√© = element;
    }

    public int TrouverIndex() throws Exception {

        for (int i = 0; i < TabElement.length  ; i++) {
            if (TabElement[i].equals(elementRecherch√©))
            { return i ;}

        }

        throw new NoSuchElementException("Mot pas trouv√©");
    }



}
