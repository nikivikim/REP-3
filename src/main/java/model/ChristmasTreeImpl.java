package model;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import model.ChristmasTree;

public class ChristmasTreeImpl implements ChristmasTree {
    public void draw(Pane pane) {
        Polygon tree = new Polygon();
        tree.setFill(Color.GREEN);
        tree.getPoints().addAll(new Double[] { 239.0, 93.0,120.0, 260.0, 349.0, 260.0,});
        Polygon tree1 = new Polygon();
        tree1.setFill(Color.GREEN);
        tree1.getPoints().addAll(new Double[] { 239.0, 193.0,120.0, 360.0, 359.0, 360.0,});

        tree.setStroke(Color.BLACK);
        tree.setStrokeWidth(1);
        pane.getChildren().addAll(tree);

        tree1.setStroke(Color.BLACK);
        tree1.setStrokeWidth(1);
        pane.getChildren().addAll(tree1);

        Rectangle stvol = new Rectangle();
        stvol.setX(230);
        stvol.setY(361);
        stvol.setWidth(30);
        stvol.setHeight(50);
        stvol.setFill(Color.BROWN);
        pane.getChildren().addAll(stvol);
    }
}
