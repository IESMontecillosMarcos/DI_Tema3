/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_t3_453;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author CRAMi
 */
public class DI_T3_453 extends Application {
    
    final static String[] rooms = new String[]{
        "Accommodation (BB)",
        "Half Board",
        "Late Check-out",
        "Extra Bed"
    };
    final static Integer[] rates = new Integer[]{
        100, 20, 10, 30
    };
    final CheckBox[] cbs = new CheckBox[rooms.length];
    final Label total = new Label("Total: $0");
    Integer sum = 0;
    
    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(new Group());
        stage.setTitle("Tooltip Sample");        
        stage.setWidth(330);
        stage.setHeight(150);

        total.setFont(new Font("Arial", 20));
        
        for (int i = 0; i < rooms.length; i++) {
            final CheckBox cb = cbs[i] = new CheckBox(rooms[i]);
            final Integer rate = rates[i];
            final Tooltip tooltip = new Tooltip("$" + rates[i].toString());
            tooltip.setFont(new Font("Arial", 16));
            cb.setTooltip(tooltip);
	    cb.selectedProperty().addListener(
                (ObservableValue<? extends Boolean> ov, Boolean old_val, 
                Boolean new_val) -> {
                    if (cb.isSelected()) {
                        sum = sum + rate;
                    } else {
                        sum = sum - rate;
                    }
                    total.setText("Total: $" + sum.toString());
                }
            );
        }

        VBox vbox = new VBox();
        vbox.getChildren().addAll(cbs);
        vbox.setSpacing(5);
        HBox root = new HBox();
        root.getChildren().add(vbox);
        root.getChildren().add(total);
        root.setSpacing(40);
        root.setPadding(new Insets(20, 10, 10, 20));

        ((Group) scene.getRoot()).getChildren().add(root);

        scene.getStylesheets().add(getClass().getResource("TooltipSample.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
