package com.vandendaelen.punklauncher;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import javax.swing.*;

public class PunkLauncher extends Application {

    private Button btnLaunch;
    private Button btnLogin;
    private Button btnLogout;

    //Pour montrer à Cala
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Init
        HBox root = new HBox();
        HBox loginBox = new HBox();
        GridPane grid = new GridPane();

        root.setPadding(new Insets(10, 10, 10, 10));

        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);

        primaryStage.setTitle("Punk Launcher");

        //Buttons grid
        btnLaunch = new Button("Lancer");
        GridPane.setConstraints(btnLaunch,0,0);
        btnLogin = new Button("Se connecter");
        GridPane.setConstraints(btnLogin,0,1);
        btnLogout = new Button("Se déconnecter");
        GridPane.setConstraints(btnLogout,0,2);

        grid.getChildren().addAll(btnLaunch,btnLogin,btnLogout);

        btnLaunch.setPrefSize(200,20);
        btnLogin.setPrefSize(200,20);
        btnLogout.setPrefSize(200,20);

        //LoginBox
        Label labelEmail = new Label("Email:");
        TextField textEmail = new TextField();
        Label labelPassword = new Label("Password:");
        PasswordField textPassword = new PasswordField();

        loginBox.getChildren().addAll(labelEmail, textEmail, labelPassword, textPassword);

        //Events
        btnLaunch.setOnAction(event ->{

        });

        btnLogin.setOnAction(event -> {

        });

        btnLogout.setOnAction(event -> {

        });

        //Root
        root.getChildren().addAll(grid, loginBox);

        Scene scene = new Scene(root,800,500);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
