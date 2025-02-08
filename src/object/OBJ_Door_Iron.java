package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Door_Iron extends SuperObject{

    public OBJ_Door_Iron(){

        name = "Door Iron";
        try{
            image = ImageIO.read(getClass().getResourceAsStream("/objects/door_iron.png"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
