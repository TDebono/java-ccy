import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("Song A");
    desertIslandPlaylist.add("Song B");
    System.out.println(desertIslandPlaylist.size());
    int ina = 0;
    int inb = 1;
    String tempA = desertIslandPlaylist.get(ina);
    String tempB = desertIslandPlaylist.get(inb);
    desertIslandPlaylist.set(ina, tempB);
    desertIslandPlaylist.set(inb, tempA);

    System.out.println(desertIslandPlaylist);
  }
  
}
