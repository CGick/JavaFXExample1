package edu.cis232;

import java.net.MalformedURLException;
import java.net.URL;

import javafx.scene.image.Image;

public class BetterImage extends Image {

	public BetterImage(String filename)  {
		
		super(BetterImage.class.getResource(filename).toString());

	}
}
