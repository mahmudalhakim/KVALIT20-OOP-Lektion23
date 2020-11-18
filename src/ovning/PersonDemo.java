package ovning;

import javax.swing.*;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-11-18
 * Time: 09:19
 * Project: KVALIT20-OOP-Lektion23
 * Copyright: MIT
 */
public class PersonDemo {

  public static void main(String[] args) {

    String name = JOptionPane.showInputDialog("Ange namnet");
    Person p1 = new Person(name, "Sollentuna", "7302002");
    System.out.println(p1);


    Person p2 = new Person();
    p2.setNamn("Yasmin");
    p2.setAdress("Sollentuna");
    System.out.println(p2.getNamn());
    System.out.println(p2.getAdress());
    System.out.println(p2.getPersonnummer());
    System.out.println(p2);

  }
}
