package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Heart_Blank extends SuperObject{

    public OBJ_Heart_Blank(){

        name = "Heart Blank";
        try{
            image = ImageIO.read(getClass().getResourceAsStream("/objects/heart_blank.png"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
