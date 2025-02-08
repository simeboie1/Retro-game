package object;
import java.io.IOException;
import javax.imageio.ImageIO;
public class OBJ_BlueHeart extends SuperObject {
    public OBJ_BlueHeart(){
        name = "Blueheart";
        try{
            image = ImageIO.read(getClass().getResourceAsStream("/objects/blueheart.png"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}