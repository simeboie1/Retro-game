package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Tent extends SuperObject{

    public OBJ_Tent(){

        name = "Tent";
        try{
            image = ImageIO.read(getClass().getResourceAsStream("/objects/tent.png"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
