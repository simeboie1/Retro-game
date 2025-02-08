package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Latern extends SuperObject{

    public OBJ_Latern(){

        name = "Latern";
        try{
            image = ImageIO.read(getClass().getResourceAsStream("/objects/Latern.png"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
