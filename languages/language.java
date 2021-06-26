public class Language {

  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

  Language(String langName, int speakers, String regions, String order) {
    this.name = langName;
    this.numSpeakers = speakers;
    this.regionsSpoken = regions;
    this.wordOrder = order;
  }

  public void getInfo() {
    System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
    System.out.println("The language follows the word order: " + this.wordOrder);
  }

  public static void main(String[] args) {

    Language german = new Language("German", 150000000, "Europe", "subject-verb-object");
    german.getInfo();

    Mayan kichi = new Mayan("Kichi", 5);
    kichi.getInfo();

  }

}
