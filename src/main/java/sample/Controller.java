package sample;

import java.util.ResourceBundle;

import java.io.File;
import java.net.URL;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.stage.FileChooser;

public class Controller implements Initializable
{

  @FXML
  private AnchorPane imagePane;

  @Override
  public void initialize(URL location, ResourceBundle resources)
  {
  }

  @FXML
  private void openAndShowImage()
  {
    File file = new FileChooser().showOpenDialog(imagePane.getScene().getWindow());
    if (file != null)
    {
      Image image = new Image(file.toURI().toString());
      ImageView imageView = new ImageView(image);
      ColorAdjust desaturate = new ColorAdjust();
      desaturate.setSaturation(-1);
      imageView.setEffect(desaturate);
//      imagePane.getChildren().add(imageView);

      BackgroundSize backgroundSize = new BackgroundSize(800, 500, true, true, true, false);
      BackgroundImage backgroundImage = new BackgroundImage(imageView.getImage(), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
          BackgroundPosition.CENTER, backgroundSize);
      imagePane.setBackground(new Background(backgroundImage));
    }
  }
}
