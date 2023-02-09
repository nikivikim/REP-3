package model;

import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class Light extends TreeDecorator{
    public Circle[] circle = new Circle[9];

    public Light(ChristmasTree tree) {
        super(tree);
    }
    public void draw(Pane paneLight) {
        super.draw(paneLight);
        drawLight(paneLight);
    }

    private void drawLight(Pane paneLight) {
        FadeTransition[] ft = new FadeTransition[9];

        circle[0] = new Circle(210, 200, 10, Color.YELLOW);
        circle[1] = new Circle(270, 200, 10, Color.DARKKHAKI);
        circle[2] = new Circle(240, 150, 10, Color.RED);
        circle[3] = new Circle(175, 240, 10, Color.YELLOW);
        circle[4] = new Circle(240, 260, 10, Color.DARKKHAKI);
        circle[5] = new Circle(300, 240, 10, Color.RED);
        circle[6] = new Circle(155, 340, 10, Color.YELLOW);
        circle[7] = new Circle(240, 340, 10, Color.RED);
        circle[8] = new Circle(325, 340, 10, Color.DARKKHAKI);

        for (int i = 0; i < ft.length; i++) {
            ft[i] = new FadeTransition(Duration.millis(1000), circle[i]);
            ft[i].setFromValue(1.0);
            ft[i].setToValue(0.0);
            ft[i].setCycleCount(Timeline.INDEFINITE);
            ft[i].setAutoReverse(true);
            ft[i].play();

        }
        paneLight.getChildren().addAll(circle[0], circle[1], circle[2], circle[3], circle[4], circle[5], circle[6], circle[7], circle[8]);
    }
}
