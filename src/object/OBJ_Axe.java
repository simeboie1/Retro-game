package object;
import java.io.IOException;
import javax.imageio.ImageIO;
public class OBJ_Axe extends SuperObject {
    public OBJ_Axe(){
        name = "Axe";
        try{
            image = ImageIO.read(getClass().getResourceAsStream("/objects/axe.png"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}