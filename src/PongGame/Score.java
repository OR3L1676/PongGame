package PongGame;
import java.awt.*;

public class Score extends Rectangle {

    static int GAME_WIDTH;
    static int GAME_HEIGHT;
    int player1;
    int player2;
    String namePlayer1 = "Player 1";
    String namePlayer2 = "Player 2";

    Score(int GAME_WIDTH, int GAME_HEIGHT){
        Score.GAME_WIDTH = GAME_WIDTH;
        Score.GAME_HEIGHT = GAME_HEIGHT;
    }
    public void draw(Graphics g){
        g.setColor(Color.white);
        g.setFont(new Font("Consolas", Font.PLAIN,60));
        g.setColor(Color.RED);
        g.drawOval(x,y,width,height);
        g.setColor(Color.WHITE);
        g.drawOval((GAME_WIDTH/2)-125,(GAME_HEIGHT/2)-125,250,250);
        g.drawLine(GAME_WIDTH/2, 0, GAME_WIDTH/2, GAME_HEIGHT);
        g.drawString(String.valueOf(player1/10)+String.valueOf(player1%10), (GAME_WIDTH/2)-85,50);
        g.drawString(String.valueOf(player2/10)+String.valueOf(player2%10), (GAME_WIDTH/2)+20,50);
        g.setFont(new Font("Consolas", Font.PLAIN,30));
        g.setColor(Color.CYAN);
        g.drawString(namePlayer1, GAME_WIDTH/100, 30);
        g.setColor(Color.ORANGE);
        g.drawString(namePlayer2, GAME_WIDTH-150, 30);

    }
}
