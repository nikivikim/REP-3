package com.example.decorator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import model.*;

public class HelloController {
    @FXML
    public Pane paneLight;
    public Pane panePresent;
    public Pane paneTree;
    public Pane paneStar;
    public Pane paneSnowman;

    @FXML
    public void initialize() {
        paneTree.toFront();
        ChristmasTree tree = new ChristmasTreeImpl();
        tree.draw(paneTree);

    }

    public void addLights(ActionEvent actionEvent) {
        paneLight.toFront();
        ChristmasTree tree = new Light(new ChristmasTreeImpl());
        tree.draw(paneLight);
    }

    public void addPresents(ActionEvent actionEvent) {
        panePresent.toFront();
        ChristmasTree tree = new Presents(new ChristmasTreeImpl());
        tree.draw(panePresent);
    }

    public void addStar(ActionEvent actionEvent) {
        paneStar.toFront();
        ChristmasTree tree = new Star(new ChristmasTreeImpl());
        tree.draw(paneStar);
    }
    public void addSnowman(ActionEvent actionEvent) {
        paneSnowman.toFront();
        ChristmasTree tree = new Snowman(new ChristmasTreeImpl());
        tree.draw(paneSnowman);
    }

    public void addAll(ActionEvent actionEvent) {
    paneLight.toFront();
    ChristmasTree tree = new Presents(new Light(new Star(new Snowman(new ChristmasTreeImpl()))));
    tree.draw(paneLight);
    }



    public void del(ActionEvent actionEvent) {

        paneLight.getChildren().clear();
        paneStar.getChildren().clear();
        panePresent.getChildren().clear();
        paneTree.getChildren().clear();
        paneLight.getChildren().clear();
        paneSnowman.getChildren().clear();
        ChristmasTree tree = new ChristmasTreeImpl();
        tree.draw(paneTree);
    }


    public void addTwo(ActionEvent event) {
        paneStar.toFront();
        ChristmasTree tree = new Star(new Snowman(new ChristmasTreeImpl()));
        tree.draw(paneStar);
    }
}