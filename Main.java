package de.meziane.javafx.stackoverflow;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class Main extends Application {

    boolean justTesttheFirst = true;

    @Override
    public void start(final Stage primaryStage) {

        Employee emp = new Employee();
        emp.setFirstname("");
        emp.setLastname("");
        emp.setSalary(12.500);

        Label labaelSalary = new Label();
        labaelSalary.textProperty().bind(emp.salaryProperty().asString("%.2f"));
        Button okButton = new Button("OK");
        okButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(final ActionEvent event) {
                double salary = Math.random() * 10000;
                emp.setSalary(salary);
            }
        });

        HBox hBox = new HBox(10, labaelSalary, okButton);

        hBox.setPadding(new Insets(20));
        hBox.setAlignment(Pos.CENTER);
        primaryStage.setScene(new Scene(hBox));
        emp.setSalary(20.300);

        primaryStage.setWidth(400);
        primaryStage.setHeight(600);
        primaryStage.show();
    }

    public void changeSalary() {

    }

    public static void main(final String[] args) {
        launch(args);
    }
}
