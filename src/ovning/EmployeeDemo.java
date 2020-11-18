package ovning;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-11-18
 * Time: 10:27
 * Project: KVALIT20-OOP-Lektion23
 * Copyright: MIT
 */
public class EmployeeDemo {

  public static void main(String[] args) {

    Employee e1 = new Employee();
    e1.setNamn("Erik");
    e1.setPersonnummer("901201");
    e1.setBefattning("Testare");
    e1.setLön(30000);
    System.out.println(e1);

    e1.höjLön(); // 10% höjning
    System.out.println(e1);

    e1.höjLön(5); // 5% höjning
    System.out.println(e1);

  }
}
