import java.util.Scanner;

public class logic {


    public int body1;
    public int body2;

    public int gemy1;
    public int gemy2;

    public int sety1;
    public int sety2;
    public int win;

    public boolean vyhoda1 = false;
    public boolean vyhoda2 = false;

    public void Ready(input inputos, output outputos){

        //HRÁČ 1

        if (inputos.player.equals(outputos.A)){
            outputos.P1();

            if (body1 == 30){
                body1 += 10;
                outputos.Status(logic.this);
            }else if(body1 < 40){
                body1 += 15;
                outputos.Status(logic.this);
            } else if (body1 == 40 && body2 != 40) {
                body1 = 0;
                body2 = 0;
                gemy1++;
                if (gemy1 == 6){
                    sety1++;
                    gemy1 = 0;
                    gemy2 = 0;
                    body1 = 0;
                    body2 = 0;
                    if(sety1 == 2){
                        outputos.Win1();
                        win++;
                    }
                }
                outputos.Status(logic.this);
            }else if (vyhoda2 == true) {
                vyhoda1 = false;
                vyhoda2 = false;
                outputos.Status(logic.this);
            }else if (vyhoda1 == true) {
                gemy1++;
                vyhoda1 = false;
                vyhoda2 = false;
                body1 = 0;
                body2 = 0;
                if (gemy1 == 6){
                    sety1++;
                    gemy1 = 0;
                    gemy2 = 0;
                    body1 = 0;
                    body2 = 0;
                    if(sety1 == 2){
                        outputos.Win2();
                        win++;
                    }
                }
                outputos.Status(logic.this);
            } else if(body2 == 40 && body1 == 40){
                vyhoda1 = true;
                vyhoda2 = false;
                outputos.Status(logic.this);
            }

            //HRÁČ 2

        }else if (inputos.player.equals(outputos.D)) {
            outputos.P2();

            if (body2 == 30) {
                body2 += 10;
                outputos.Status(logic.this);
            } else if (body2 < 40) {
                body2 += 15;
                outputos.Status(logic.this);
            } else if (body2 == 40 && body1 != 40) {
                body1 = 0;
                body2 = 0;
                gemy2++;
                if (gemy1 == 6){
                    sety1++;
                    gemy1 = 0;
                    gemy2 = 0;
                    body1 = 0;
                    body2 = 0;
                }
                outputos.Status(logic.this);
            }else if (vyhoda1 == true) {
                vyhoda1 = false;
                vyhoda2 = false;
                outputos.Status(logic.this);
            }else if (vyhoda2 == true) {
                gemy2++;
                body1 = 0;
                body2 = 0;
                vyhoda1 = false;
                vyhoda2 = false;
                if (gemy1 == 6){
                    sety1++;
                    gemy1 = 0;
                    gemy2 = 0;
                    body1 = 0;
                    body2 = 0;
                }
                outputos.Status(logic.this);
            }else if(body2 == 40 && body1 == 40){
                vyhoda2 = true;
                vyhoda1 = false;
                outputos.Status(logic.this);
            }

        }else {
            outputos.Err();

        }
    }
}