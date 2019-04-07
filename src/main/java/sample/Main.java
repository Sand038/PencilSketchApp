package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import jfxtras.styles.jmetro8.JMetro;

public class Main extends Application
{

  @Override
  public void start(Stage primaryStage) throws Exception
  {
    Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
    new JMetro(JMetro.Style.LIGHT).applyTheme(root);
    primaryStage.setTitle("Pencil Sketch App");
    primaryStage.setScene(new Scene(root, 800, 600));
    primaryStage.show();
  }

  public static void main(String[] args)
  {
    launch(args);
  }
}
