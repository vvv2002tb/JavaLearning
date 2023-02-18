package Chuong3.SounDeck;

public class SoundDeckTestDrive {
    public static void main(String[] args) {
        SoundDeck t = new SoundDeck();
        t.canRecord = true;
        t.play();
        if (t.canRecord == true) {
            t.record();
        }
    }
}
