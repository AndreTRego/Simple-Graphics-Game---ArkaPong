package org.academiadecodigo.tropadelete.charlie;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Stage {
    private final int PADDING = 10;
    private Brick[] brick;
    private Player player1;
    private Player player2;
    private Ball ball;
    private boolean gameEnd;


    private final int STAGE_HEIGHT = 500;
    private final int player1_OFFSET = 30;
    private final int player2_OFFSET = 1260;


    public Stage() {
        player1 = new Player(player1_OFFSET, 10, STAGE_HEIGHT);
        player2 = new Player(player2_OFFSET, 10, STAGE_HEIGHT);
        ball = new Ball(10, 10);
    }


    public void init() {
        Rectangle canvas = new Rectangle(PADDING, PADDING, 1280, 768);
        canvas.draw();


        new KeyboardListener(player1, player2);
    }

    public void start() {

        while (true) {
            try {
                Thread.sleep(0);
                player1.move();
                player2.move();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


    }

}
