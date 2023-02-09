package model;

import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;



public class Snowman extends TreeDecorator {
    public Snowman(ChristmasTree tree) {
        super(tree);
    }
    public Circle[] circle = new Circle[7];
    public void draw(Pane paneSnowman) {
        super.draw(paneSnowman);
        DrawSnow(paneSnowman);
    }

    private void DrawSnow(Pane paneSnowman) {

        Polygon nose = new Polygon();
        nose.setFill(Color.ORANGERED);
        nose.getPoints().addAll(new Double[] { 50.0,220.0 ,50.0, 215.0,65.0,217.0 ,});

        Polygon arm = new Polygon();
        arm.setFill(Color.GREY);
        arm.getPoints().addAll(new Double[] { 0.0,220.0 ,22.0, 250.0});

        Polygon arm2 = new Polygon();
        arm2.setFill(Color.GREY);
        arm2.getPoints().addAll(new Double[] { 100.0,220.0 ,78.0, 250.0});

        Rectangle hat = new Rectangle();
        hat.setX(35);
        hat.setY(160);
        hat.setWidth(32);
        hat.setHeight(40);
        hat.setFill(Color.GREY);
        hat.setArcWidth(20);
        hat.setArcHeight(20);


        FadeTransition[] ft = new FadeTransition[7];

        circle[0] = new Circle(50, 340, 50, Color.WHITE);
        circle[1] = new Circle(50, 260, 30, Color.WHITE);
        circle[2] = new Circle(50, 210, 20, Color.WHITE);
        circle[3] = new Circle(50, 320, 5, Color.BLACK);
        circle[4] = new Circle(50, 260, 5, Color.BLACK);
        circle[5] = new Circle(46, 210, 2, Color.BLACK);
        circle[6] = new Circle(54, 210, 2, Color.BLACK);


        for (int i = 0; i < ft.length; i++) {
            ft[i] = new FadeTransition(Duration.millis(1000), arm2);
            ft[i].setFromValue(1.0);
            ft[i].setToValue(0.0);
            ft[i].setCycleCount(Timeline.INDEFINITE);
            ft[i].setAutoReverse(true);
            ft[i].play();

        }

        nose.setStroke(Color.BLACK);
        nose.setStrokeWidth(1);

        arm.setStroke(Color.BLACK);
        arm.setStrokeWidth(2);

        arm2.setStroke(Color.BLACK);
        arm2.setStrokeWidth(2);

        paneSnowman.getChildren().addAll(circle[0], circle[1], circle[2], circle[3], circle[4], circle[5], circle[6], nose,arm, arm2, hat);
    }
}
