package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Manacrystal_Full extends SuperObject{

    public OBJ_Manacrystal_Full(){

        name = "Manacrystal Full";
        try{
            image = ImageIO.read(getClass().getResourceAsStream("/objects/manacrystal_full.png"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
