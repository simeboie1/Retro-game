package object;
import java.io.IOException;
import javax.imageio.ImageIO;
public class OBJ_Coin_Bronze extends SuperObject {
    public OBJ_Coin_Bronze(){
        name = "Coin Bronze";
        try{
            image = ImageIO.read(getClass().getResourceAsStream("/objects/coin_bronze.png"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}