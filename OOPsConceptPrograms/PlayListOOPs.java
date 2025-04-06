import java.util.ArrayList;

class PlayList{
    ArrayList<String> list;
    PlayList(){
        this.list=new ArrayList<>();
    }

    void addSong(String song){
        list.add(song);
    }
    void removeSong(String song){
        list.remove(song);
    }
    void printPlaylist(){
        for (String song: list) {
            System.out.println(song);
        }
    }
} 
public class PlayListOOPs {
    public static void main(String[] args) {
        PlayList telugu = new PlayList();
        PlayList hindi = new PlayList();
        telugu.addSong("t1");
        telugu.addSong("t2");
        hindi.addSong("h1");
        hindi.addSong("h2");
        telugu.printPlaylist();
        hindi.printPlaylist();
    }
}
