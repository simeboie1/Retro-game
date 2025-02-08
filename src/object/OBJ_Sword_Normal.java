package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Sword_Normal extends SuperObject{

    public OBJ_Sword_Normal(){

        name = "Sword Normal";
        try{
            image = ImageIO.read(getClass().getResourceAsStream("/objects/sword_normal.png"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
