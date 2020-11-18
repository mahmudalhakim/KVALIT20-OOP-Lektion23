package ovning;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-11-18
 * Time: 09:16
 * Project: KVALIT20-OOP-Lektion23
 * Copyright: MIT
 * <p>
 * Skapa en klass Person som beskriver en person.
 * Definiera följande egenskaper:
 * namn, adress och personnummer.
 * Skapa setters och getters.
 */
public class Person {

  // Instansvariabler
  private String namn;
  private String adress;
  private String personnummer;

  // Konstruktor

  /**
   * Default konstruktor
   */
  public Person() {
    namn = "";
    adress = "";
    personnummer = "";
  }

  /**
   * En egen konstruktor
   *
   * @param namn
   * @param adress
   * @param personnummer
   */
  public Person(String namn, String adress, String personnummer) {
    setNamn(namn);
    setAdress(adress);
    setPersonnummer(personnummer);
  }

  /**
   * Sätter namnet
   *
   * @param namn
   */
  public void setNamn(String namn) {

    if (namn == null)
      throw new NullPointerException();

    if (namn.isBlank())
      throw new IllegalArgumentException("Namnet får inte vara tomt");

    this.namn = namn;

  }

  /**
   * Hämtar namnet
   *
   * @return
   */
  public String getNamn() {
    return namn;
  }

  /**
   * Hämtar adressen
   *
   * @return
   */
  public String getAdress() {
    return adress;
  }

  /**
   * Sätter adressen
   *
   * @param adress
   */
  public void setAdress(String adress) {

    if (adress == null)
      throw new NullPointerException();

    if (adress.isBlank())
      throw new IllegalArgumentException("Adressen får inte vara tomt");

    this.adress = adress;
  }

  /**
   * Hämtar personnummer
   *
   * @return
   */
  public String getPersonnummer() {
    return personnummer;
  }

  /**
   * Sätter personnumret
   *
   * @param personnummer
   */
  public void setPersonnummer(String personnummer) {

    if (personnummer == null)
      throw new NullPointerException();

    if (personnummer.isBlank())
      throw new IllegalArgumentException("Personnummer får inte vara tomt");

    this.personnummer = personnummer;
  }

  /**
   * En egen toString
   *
   * @return
   */
  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Person{");
    sb.append("namn='").append(namn).append('\'');
    sb.append(", adress='").append(adress).append('\'');
    sb.append(", personnummer='").append(personnummer).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
