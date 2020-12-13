/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_t3_452;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Marcos Gonzalez Leon
 */
public class DI_T3_452 extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        /*
        
        Preguntas:
        - ¿Incluye la clase metodos get y set? ¿Cuales?
        
        Si. Getters y Setters para cada uno de los componentes y las Properties.
        
        - ¿Inlcluye esta clase la gestion de eventos? ¿Donde?
        
        Si. Posee un metodo cuando el boton "Click Me" es usado.
        
        - ¿Para que improtamos la clase javafx.beans.property.StringProperty?
        
        Una property es una clase wrapper que encapsula los campos de un objeto o 
        componente de nuestro diseño. Gracias a ella podemos obtener funcionadlidades
        extras para gestionar el control o la implementacion.
        
        */
        
        
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
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
