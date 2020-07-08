package sample;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.shape.Rectangle;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
        ObservableList list = root.getChildren();
        Scene scene = new Scene(root, 700, 700);
        scene.setFill(Color.BLANCHEDALMOND);

        Line line = new Line();
        line.setStartX(10.0);
        line.setStartY(20.0);
        line.setEndX(20);
        line.setEndY(30);

        Text text = new Text();
        text.setText("Hiiiii");
        text.setX(50);
        text.setY(20);
        text.setFont(new Font(20));
        text.setUnderline(true);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(20);
        rectangle.setY(30);
        rectangle.setHeight(40);
        rectangle.setWidth(50);
        rectangle.setFill(Color.AQUAMARINE);

        Image image = new Image("https://www.tutorialspoint.com/green/images/logo.png");
        ImageView imageView = new ImageView(image);

        imageView.setX(100);
        imageView.setY(100);

        imageView.setFitHeight(200);
        imageView.setFitWidth(400);

//Setting the preserve ratio of the image view
        imageView.setPreserveRatio(true);

        Tab tab1 = new Tab("Spreadsheet");
        Tab tab2 = new Tab("Statistics");
        
       TextField textField1 = new TextField();
        Label label = new Label("Button");
       Button button1 = new Button("Submit");
        VBox vBox = new VBox(label, button1);
       GridPane gridPane = new GridPane();
       gridPane.setMinSize(500,500);
        gridPane.setPadding(new Insets(20));
        gridPane.add(vBox, 0, 0);
        gridPane.add(textField1, 1, 0);
        list.add(gridPane);
        //list.add(text);
        //list.add(line);
        //list.add(rectangle);
        //list.add(imageView);

        primaryStage.setTitle("Hi there");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
