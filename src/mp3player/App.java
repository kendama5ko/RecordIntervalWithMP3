package mp3player;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import java.io.File;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch();
    }

    @Override
    public void start(Stage primaryStage) {
        Media media = new Media(new File("src/Wave.mp3").toURI().toString());
        // Media media = new Media(getClass().getResource(mediaPath).toExternalForm());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
        mediaPlayer.setVolume(0.1);
        // Create a label to display some text
        Label label = new Label(String.valueOf(mediaPlayer.getVolume()));

        // Create a StackPane layout and add the label to it
        StackPane root = new StackPane();
        root.getChildren().add(label);

        // Create a Scene with the root layout
        Scene scene = new Scene(root, 300, 200);

        // Set the scene to the stage
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();

    }

}
