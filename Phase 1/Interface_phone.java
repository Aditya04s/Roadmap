interface Camera{
    void takePhoto();
}
interface MediaPlayer{
    void playMusic();
}
class Phone implements Camera, MediaPlayer
{
    public void takePhoto()
    {
        System.out.println("Photo Captured");
    }
    public void playMusic()
    {
        System.out.println("Music playing");
    }
}

public class Interface_phone {
    public static void main(String[] args){ 
        
        Phone jio = new Phone();

        jio.takePhoto();
        jio.playMusic();
    }
}