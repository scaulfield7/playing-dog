public class PlayingDog{
    public static boolean isDogPlayingOutside(boolean summer, boolean isRaining, int temperature){
        if(isRaining){
            return false;
        }else if(summer && temperature >= 5 && temperature <= 25){
            return true;
        }else if(!summer && temperature >= 5 && temperature <= 20){
            return true;
        }else{
            return false;
        }
    }
}
