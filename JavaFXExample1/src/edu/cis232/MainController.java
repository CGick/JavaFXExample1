package edu.cis232;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainController {
	@FXML
	Label label;
	@FXML
	ImageView image;
	
	int clickCount = 0;
	Image deadpool1 = new Image(getClass().getResource("dead pool.jpg").toString());
	Image deadpool2 = new Image(getClass().getResource("deadpool2.jpg").toString());
	public void initialize(){
		System.out.println("Initializing...");
		image.setImage(deadpool1);
	}
	
	public void buttonListener(){
		System.out.println("ButtonClicked!");
		label.setText(String.format("You Clicked the Button! %d", ++clickCount));
	}

    @FXML
    public void buttonPress() {
    	image.setImage(deadpool2);
    }

    @FXML
    public void buttonRelease() {
    	image.setImage(deadpool1);
    }

}
