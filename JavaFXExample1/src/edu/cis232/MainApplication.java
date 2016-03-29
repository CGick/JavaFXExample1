package edu.cis232;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApplication extends Application {

	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent parent = FXMLLoader.load(getClass().getResource("main.fxml"));
		
		//build the scene graph
		Scene scene = new Scene(parent);
		
		//set the stage
		stage.setTitle("Hello World!");
		stage.setScene(scene);
		
		//show the stage
		stage.show();
	}
}
