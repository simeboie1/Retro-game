package entity;

import main.GamePanel;
import main.KeyHandler;
import main.UtilityTool;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;


public class Player extends Entity{

    KeyHandler keyH;
    public final int screenX;
    public final int screenY;
    //public int hasKey = 0;

    public Player(GamePanel gp, KeyHandler keyH){
        super(gp);
        this.keyH = keyH;

        screenX = gp.screenWidth/2 - (gp.tileSize/2);
        screenY = gp.screenHeight/2 - (gp.tileSize/2);

        solidArea = new Rectangle(8,16, 32, 32);
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;

        setDefaultValues();
        getPlayerImage();
    }
    public void setDefaultValues(){
        worldX = gp.tileSize * 23;
        worldY = gp.tileSize * 21;
        speed = 4;
        direction = "down";
    }
    public void getPlayerImage(){

        up1 = setup("/player/armor_hero_up_1");
        up2 = setup("/player/armor_hero_up_2");
        upIdle = setup("/player/gubbe_upp_idle");
        down1 = setup("/player/armor_hero_down_1");
        down2 = setup("/player/armor_hero_down_2");
        downIdle = setup("/player/gubbe_ner_idle");
        left1 = setup("/player/gubbe_ner_1");
        left2 = setup("/player/gubbe_ner_2");
        right1 = setup("/player/gubbe_höger_1");
        right2 = setup("/player/gubbe_höger_2");

    }
    public void update(){
        direction = "idle";
        int prevWorldX = worldX;
        int prevWorldY = worldY;

        if(keyH.upPressed == true || keyH.downPressed == true || keyH.leftPressed == true || keyH.rightPressed == true){
            if(keyH.upPressed == true){
                direction = "up";
                worldY -= speed;
            }
            if(keyH.downPressed == true){
                worldY += speed;
                direction = "down";
            }
            if(keyH.leftPressed == true){
                worldX -= speed;
                direction = "left";

            }
            if(keyH.rightPressed == true){
                worldX += speed;
                direction = "right";
            }

            //Check tile collision
            collisionOn = false;
            gp.cChecker.checkTile(this);

            //CHECK NPC COLLISION
            int npcIndex = gp.cChecker.checkEntity(this, gp.npc);
            interactNPC(npcIndex);

            //CHECK OBJECT COLLISION
            int objIndex = gp.cChecker.checkObject(this, true);
            pickUpObject(objIndex);

            //If Collision is flase, player can move
            if (collisionOn) {
                worldX = prevWorldX;
                worldY = prevWorldY;
            }

            spriteCounter++;
            if(spriteCounter > 12){
                if(spriteNum == 1){
                    spriteNum = 2;
                }
                else if(spriteNum == 2){
                    spriteNum = 1;
                }
                spriteCounter = 0;
            }
/*
            if(collisionOn == true){
                switch(direction){
                    case "up":
                        worldY += speed;
                        break;
                    case "down":
                        worldY -= speed;
                        break;
                    case "left":
                        worldX += speed;
                        break;
                    case "right":
                        worldX -= speed;
                        break;
                }


            }

 */
        }
    }

    public void pickUpObject(int i){

        if(i != 999){

        }
    }
    public void interactNPC(int i){

        if(i != 999){
            if(gp.keyH.enterPressed == true) {
                gp.gameState = gp.dialogueState;
                gp.npc[i].speak();
            }
        }
        gp.keyH.enterPressed = false;
    }

    public void draw(Graphics2D g2){
        //g2.setColor(Color.white);
        //g2.fillRect(x, y, gp.tileSize, gp.tileSize);
        BufferedImage image = null;

        switch(direction){
            case "up":
                if(spriteNum == 1){
                    image = up1;
                }
                if(spriteNum == 2){
                    image = up2;
                }
                break;
            case "down":
                if(spriteNum == 1){
                    image = down1;
                }
                if(spriteNum == 2){
                    image = down2;
                }
                break;
            case "left":
                if(spriteNum == 1){
                    image = left1;
                }
                if(spriteNum == 2){
                    image = left2;
                }
                break;
            case "right":
                if(spriteNum == 1){
                    image = right1;
                }
                if(spriteNum == 2){
                    image = right2;
                }
                break;
            case "idle":
                image = downIdle;
                break;

        }
        g2.drawImage(image, screenX, screenY, null);
    }




}
