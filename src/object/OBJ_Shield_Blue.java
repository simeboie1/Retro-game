package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Shield_Blue extends SuperObject{

    public OBJ_Shield_Blue(){

        name = "Shield Blue";
        try{
            image = ImageIO.read(getClass().getResourceAsStream("/objects/shield_blue.png"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
