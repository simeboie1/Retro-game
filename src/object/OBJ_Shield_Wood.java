package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Shield_Wood extends SuperObject{

    public OBJ_Shield_Wood(){

        name = "Shield Wood";
        try{
            image = ImageIO.read(getClass().getResourceAsStream("/objects/shield_wood.png"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
