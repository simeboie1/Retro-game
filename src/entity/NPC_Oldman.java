package entity;

import main.GamePanel;
import java.util.Random;

public class NPC_Oldman extends Entity{

    //NPC CONSTRUCTOR
    public NPC_Oldman(GamePanel gp){
        super(gp);

        direction = "down";
        speed = 1;
        getImage();
        setDialogue();
    }
    //NPC IMAGE
    public void getImage(){

        up1 = setup("/npc/oldman_up_1");
        up2 = setup("/npc/oldman_up_2");
        down1 = setup("/npc/oldman_down_1");
        down2 = setup("/npc/oldman_down_2");
        left1 = setup("/npc/oldman_left_1");
        left2 = setup("/npc/oldman_left_2");
        right1 = setup("/npc/oldman_right_1");
        right2 = setup("/npc/oldman_right_2");

    }
    //DIALOG METHOD
    public void setDialogue(){

        dialogues[0] = "Oh, hi there!";
        dialogues[1] = "How did you end up here?";
        dialogues[2] = "Oh well, can you help me find my key?";
        dialogues[3] = "The key goes to a chest \n where i stored my greatest gifts... \n typical of me to lose the key";


    }
    public void setAction(){

        actionLockCounter ++;

        if(actionLockCounter == 120) {

            Random random = new Random();
            int i = random.nextInt(100) + 1; // random number between 1-100


            if (i <= 25) {
                direction = "up";
            }
            if (i > 25 && i <= 50) {
                direction = "down";
            }
            if (i > 50 && i <= 75) {
                direction = "left";
            }
            if (i > 75 && i <= 100) {
                direction = "right";
            }
            actionLockCounter = 0;
        }
    }
    public void speak(){
        super.speak();

    }
}
