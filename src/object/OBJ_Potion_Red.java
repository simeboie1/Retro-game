package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Potion_Red extends SuperObject{

    public OBJ_Potion_Red(){

        name = "Potion Red";
        try{
            image = ImageIO.read(getClass().getResourceAsStream("/objects/potion_red.png"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
