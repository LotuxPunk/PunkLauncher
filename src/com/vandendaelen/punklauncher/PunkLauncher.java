package com.vandendaelen.punklauncher;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

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
        primaryStage.setTitle("Punk Launcher");

        btnLaunch = new Button("Lancer");
        btnLogin = new Button("Se connecter");
        btnLogout = new Button("Se déconnecter");

        btnLaunch.setOnAction(event ->{

        });

        btnLogin.setOnAction(event -> {

        });

        btnLogout.setOnAction(event -> {

        });

        StackPane layout = new StackPane();
        layout.getChildren().addAll(btnLaunch,btnLogin,btnLogout);

        Scene scene = new Scene(layout,800,500);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
