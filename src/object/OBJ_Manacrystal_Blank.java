package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Manacrystal_Blank extends SuperObject{

    public OBJ_Manacrystal_Blank(){

        name = "Manacrystal blank";
        try{
            image = ImageIO.read(getClass().getResourceAsStream("/objects/manacrystal_blank.png"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
