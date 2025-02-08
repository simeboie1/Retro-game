package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Heart_Half extends SuperObject{

    public OBJ_Heart_Half(){

        name = "Heart half";
        try{
            image = ImageIO.read(getClass().getResourceAsStream("/objects/heart_half.png"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
