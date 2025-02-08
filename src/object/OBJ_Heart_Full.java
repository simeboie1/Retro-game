package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Heart_Full extends SuperObject{

    public OBJ_Heart_Full(){

        name = "Heart Full";
        try{
            image = ImageIO.read(getClass().getResourceAsStream("/objects/heart_full.png"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
