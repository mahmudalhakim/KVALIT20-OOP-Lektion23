package listor;

import java.util.ArrayList;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-11-18
 * Time: 11:17
 * Project: KVALIT20-OOP-Lektion23
 * Copyright: MIT
 */
public class ListDemo {
  public static void main(String[] args) {

    // Skapa en lista som lagrar strängar
    var names = new ArrayList<String>();

    // Lägga till nya element
    names.add("Mahmud");
    names.add("Mehdi");
    names.add("Hoda");
    names.add("Mariam");
    names.add("Dania");
    names.add("Yasir");

    // Skriv ut en lista
    for (var name : names)
      System.out.println(name);

    System.out.println("---------------------");

    // Skriv ut snabbt
    System.out.println(names);

    // Infoga ett element
    names.add(1, "Yasmin");
    System.out.println(names);

    // Ändra ett element
    names.set(0, "Mahmud Al Hakim");
    System.out.println(names.get(0));

    // Ta bort ett element
    String name = names.remove(0);
    System.out.println(names);

    // Sökning
    if (names.contains("Yasmin"))
      System.out.println("Yasmin finns i listan!");

    if (names.contains("Kalle"))
      System.out.println("Kalle finns i listan!");
    else
      System.out.println("Kalle finns inte i listan!");


    // Hämta antal element
    System.out.println("Antal: " + names.size());

    // Hämta index
    int index = names.indexOf("Dania");
    System.out.println("Dania finns på plats nr " + index);

    // Kopiera en lista
    var kopia = new ArrayList<String>(names);
    System.out.println(kopia);

    // Ta bort alla element
    names.clear();
    System.out.println(names);
    System.out.println(kopia);

    // Kolla antal specifika element


  }
}
