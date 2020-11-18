package ovning;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-11-18
 * Time: 10:26
 * Project: KVALIT20-OOP-Lektion23
 * Copyright: MIT
 * <p>
 * Skapa en subklass till Person som beskriver en anställd.
 * Spara klassen som Employee.
 * Subklassen ska ha nya egenskaper: befattning och lön
 * Skapa metoder som sätter och hämtar de nya egenskaperna.
 * Skapa en metod som höjer lönen för en anställd med 10%
 */
public class Employee extends Person {

  private String befattning;
  private double lön;

  public String getBefattning() {
    return befattning;
  }

  public void setBefattning(String befattning) {

    if (befattning == null)
      throw new NullPointerException();

    if (befattning.isBlank())
      throw new IllegalArgumentException("Befattning får inte vara tomt");

    this.befattning = befattning;
  }

  public double getLön() {
    return lön;
  }

  public void setLön(double lön) {
    if (lön < 0)
      throw new IllegalArgumentException("Lön får inte vara mindre än 0");

    this.lön = lön;
  }

  /**
   * Höj lön med 10%
   */
  public void höjLön() {
    this.lön = this.lön * 1.1;
  }

  /**
   * Höj lön med en godtycklig procentsats
   *
   * @param procent t.ex. 4.5
   */
  public void höjLön(double procent) {
    this.lön = this.lön * (1 + procent / 100);  // 1 + 4,5/100 = 1 + 0,045 = 1,045
  }


  @Override
  public String toString() {
    return
        "Namn: " + getNamn() + "\n" +
            "Adress: " + getAdress() + "\n" +
            "Personnummer: " + getPersonnummer() + "\n" +
            "Befattning: " + getBefattning() + "\n" +
            "Lön: " + getLön() + "\n";
  }
}
