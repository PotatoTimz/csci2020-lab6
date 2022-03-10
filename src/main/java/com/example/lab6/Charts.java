package com.example.lab6;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.chart.PieChart;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

import java.io.IOException;

public class Charts extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        double[] avgHousingPricesByYear = {
                247381.0,264171.4,287715.3,294736.1,
                308431.4,322635.9,340253.0,363153.7
        };
        double[] avgCommercialPricesByYear = {
                1121585.3,1219479.5,1246354.2,1295364.8,
                1335932.6,1472362.0,1583521.9,1613246.3
        };
        String[] ageGroups = {
                "18-25", "26-35", "36-45", "46-55", "56-65", "65+"
        };
        int[] purchasesByAgeGroup = {
                648, 1021, 2453, 3173, 1868, 2247
        };
        Color[] pieColours = {
                Color.AQUA, Color.GOLD, Color.DARKORANGE,
                Color.DARKSALMON, Color.LAWNGREEN, Color.PLUM
        };

        FXMLLoader fxmlLoader = new FXMLLoader(Charts.class.getResource("hello-view.fxml"));

        Group root = new Group();

        Rectangle rect10 = new Rectangle();
        rect10.setHeight(avgHousingPricesByYear[0]*0.000199);
        rect10.setWidth(10);
        rect10.setX(10);
        rect10.setY(390-avgHousingPricesByYear[0]*0.000199);
        rect10.setFill(Color.RED);

        Rectangle rect11 = new Rectangle();
        rect11.setHeight(avgHousingPricesByYear[1]*0.000199);
        rect11.setWidth(10);
        rect11.setX(40);
        rect11.setY(390-avgHousingPricesByYear[1]*0.000199);
        rect11.setFill(Color.RED);

        Rectangle rect12 = new Rectangle();
        rect12.setHeight(avgHousingPricesByYear[2]*0.000199);
        rect12.setWidth(10);
        rect12.setX(70);
        rect12.setY(390-avgHousingPricesByYear[2]*0.000199);
        rect12.setFill(Color.RED);

        Rectangle rect13 = new Rectangle();
        rect13.setHeight(avgHousingPricesByYear[3]*0.000199);
        rect13.setWidth(10);
        rect13.setX(100);
        rect13.setY(390-avgHousingPricesByYear[3]*0.000199);
        rect13.setFill(Color.RED);

        Rectangle rect14 = new Rectangle();
        rect14.setHeight(avgHousingPricesByYear[4]*0.000199);
        rect14.setWidth(10);
        rect14.setX(130);
        rect14.setY(390-avgHousingPricesByYear[4]*0.000199);
        rect14.setFill(Color.RED);

        Rectangle rect15 = new Rectangle();
        rect15.setHeight(avgHousingPricesByYear[5]*0.000199);
        rect15.setWidth(10);
        rect15.setX(160);
        rect15.setY(390-avgHousingPricesByYear[5]*0.000199);
        rect15.setFill(Color.RED);

        Rectangle rect16 = new Rectangle();
        rect16.setHeight(avgHousingPricesByYear[6]*0.000199);
        rect16.setWidth(10);
        rect16.setX(190);
        rect16.setY(390-avgHousingPricesByYear[6]*0.000199);
        rect16.setFill(Color.RED);

        Rectangle rect17 = new Rectangle();
        rect17.setHeight(avgHousingPricesByYear[7]*0.000199);
        rect17.setWidth(10);
        rect17.setX(220);
        rect17.setY(390-avgHousingPricesByYear[7]*0.000199);
        rect17.setFill(Color.RED);

        Rectangle rect20 = new Rectangle();
        rect20.setHeight(avgCommercialPricesByYear[0]*0.000199);
        rect20.setWidth(10);
        rect20.setX(20);
        rect20.setY(390-avgCommercialPricesByYear[0]*0.000199);
        rect20.setFill(Color.BLUE);

        Rectangle rect21 = new Rectangle();
        rect21.setHeight(avgCommercialPricesByYear[1]*0.000199);
        rect21.setWidth(10);
        rect21.setX(50);
        rect21.setY(390-avgCommercialPricesByYear[1]*0.000199);
        rect21.setFill(Color.BLUE);

        Rectangle rect22 = new Rectangle();
        rect22.setHeight(avgCommercialPricesByYear[2]*0.000199);
        rect22.setWidth(10);
        rect22.setX(80);
        rect22.setY(390-avgCommercialPricesByYear[2]*0.000199);
        rect22.setFill(Color.BLUE);

        Rectangle rect23 = new Rectangle();
        rect23.setHeight(avgCommercialPricesByYear[3]*0.000199);
        rect23.setWidth(10);
        rect23.setX(110);
        rect23.setY(390-avgCommercialPricesByYear[3]*0.000199);
        rect23.setFill(Color.BLUE);

        Rectangle rect24 = new Rectangle();
        rect24.setHeight(avgCommercialPricesByYear[4]*0.000199);
        rect24.setWidth(10);
        rect24.setX(140);
        rect24.setY(390-avgCommercialPricesByYear[4]*0.000199);
        rect24.setFill(Color.BLUE);

        Rectangle rect25 = new Rectangle();
        rect25.setHeight(avgCommercialPricesByYear[5]*0.000199);
        rect25.setWidth(10);
        rect25.setX(170);
        rect25.setY(390-avgCommercialPricesByYear[5]*0.000199);
        rect25.setFill(Color.BLUE);

        Rectangle rect26 = new Rectangle();
        rect26.setHeight(avgCommercialPricesByYear[6]*0.000199);
        rect26.setWidth(10);
        rect26.setX(200);
        rect26.setY(390-avgCommercialPricesByYear[6]*0.000199);
        rect26.setFill(Color.BLUE);

        Rectangle rect27 = new Rectangle();
        rect27.setHeight(avgCommercialPricesByYear[7]*0.000199);
        rect27.setWidth(10);
        rect27.setX(230);
        rect27.setY(390-avgCommercialPricesByYear[7]*0.000199);
        rect27.setFill(Color.BLUE);

        Scene scene = new Scene(root, 700, 400);
        int num = 648+1021+2453+3173+1868+2247;
        Arc arc1 = new Arc();
        arc1.setCenterX(500);
        arc1.setCenterY(200);
        arc1.setRadiusX(150.0f);
        arc1.setRadiusY(150.0f);
        arc1.setStartAngle(0);
        arc1.setLength(20.445);
        arc1.setType(ArcType.ROUND);
        arc1.setFill(pieColours[0]);
        double startAngle = 20.445;

        Arc arc2 = new Arc();
        arc2.setCenterX(500);
        arc2.setCenterY(200);
        arc2.setRadiusX(150.0f);
        arc2.setRadiusY(150.0f);
        arc2.setStartAngle(startAngle);
        arc2.setLength(32.214);
        arc2.setType(ArcType.ROUND);
        arc2.setFill(pieColours[1]);
        startAngle += 32.214;

        Arc arc3 = new Arc();
        arc3.setCenterX(500);
        arc3.setCenterY(200);
        arc3.setRadiusX(150.0f);
        arc3.setRadiusY(150.0f);
        arc3.setStartAngle(startAngle);
        arc3.setLength(77.396);
        arc3.setType(ArcType.ROUND);
        arc3.setFill(pieColours[2]);
        startAngle += 77.396;

        Arc arc4 = new Arc();
        arc4.setCenterX(500);
        arc4.setCenterY(200);
        arc4.setRadiusX(150.0f);
        arc4.setRadiusY(150.0f);
        arc4.setStartAngle(startAngle);
        arc4.setLength(100.113);
        arc4.setType(ArcType.ROUND);
        arc4.setFill(pieColours[3]);
        startAngle += 100.113;

        Arc arc5 = new Arc();
        arc5.setCenterX(500);
        arc5.setCenterY(200);
        arc5.setRadiusX(150.0f);
        arc5.setRadiusY(150.0f);
        arc5.setStartAngle(startAngle);
        arc5.setLength(58.938);
        arc5.setType(ArcType.ROUND);
        arc5.setFill(pieColours[4]);
        startAngle += 58.938;

        Arc arc6 = new Arc();
        arc6.setCenterX(500);
        arc6.setCenterY(200);
        arc6.setRadiusX(150.0f);
        arc6.setRadiusY(150.0f);
        arc6.setStartAngle(startAngle);
        arc6.setLength(70.896);
        arc6.setType(ArcType.ROUND);
        arc6.setFill(pieColours[5]);

        root.getChildren().addAll(rect10,rect11, rect12, rect13, rect14, rect15, rect16, rect17, rect20, rect21, rect22, rect23, rect24, rect25, rect26, rect27, arc1,arc2,arc3,arc4,arc5,arc6);

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}