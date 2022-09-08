public class Main{
    public static void main(String[] args){
        PlayingDog playingDog = new PlayingDog();
        System.out.println(playingDog.isDogPlayingOutside(true, false, 10));
        System.out.println(playingDog.isDogPlayingOutside(true, false, 33));
        System.out.println(playingDog.isDogPlayingOutside(false, false, 20));
        System.out.println(playingDog.isDogPlayingOutside(false, false, 21));
        System.out.println(playingDog.isDogPlayingOutside(true, true, 16));
    }
}
