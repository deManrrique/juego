package com.juego;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;



public class PrimaryController {

    @FXML
    private Label tfCantidad1;
    /*@FXML
    private Label lblResultado;*/
    @FXML
    private Label tfCantidad2;
    @FXML
    private Label lblResultadoB;
    @FXML
    private TextField resultadoUsuario;
    @FXML
    private Label Resultado;
    

    @FXML
    private void switchToSecondary() {
        /*String cantidad1 = tfCantidad1.getText().trim();
        String cantidad2 = tfCantidad2.getText().trim();

        
        try {
            int number = Integer.parseInt(cantidad1);
            
            int number2 = Integer.parseInt(cantidad2);
            int r = number + number2;
            String suma=String.valueOf(r);
            lblResultado.setText(suma);
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }*/

        int cantidad1 = (int)(Math.random()*10+1);
        String numero1=String.valueOf(cantidad1);
        tfCantidad1.setText(numero1);
        
        int cantidad2 = (int)(Math.random()*10+1);
        String numero2=String.valueOf(cantidad2); //value Of--> convierte de int a string
        tfCantidad2.setText(numero2);
        


    }
    @FXML //siempre se debe colocar la etiqueta para que se enlace @FXML
    private void BotoonTwo() {
        
        try {
            String cantidad1= tfCantidad1.getText().trim(); //guardo un label en un string
           String cantidad2=tfCantidad2.getText().trim(); //guardo un label en un string
            int number = Integer.parseInt(cantidad1); //parseInt --> de string a int
            int number2 = Integer.parseInt(cantidad2); //parseInt --> de string a int

            int sumando = number + number2;
      

            String deString_int = resultadoUsuario.getText().trim(); //obtengo el resultado del usuario
            int l = Integer.parseInt(deString_int); //y lo guado en una variable de tipo int //parseInt --> de string a int
            
            if (l == sumando) {
                Resultado.setText("correcto");
            }else {
                Resultado.setText("Incorrecto");
                
            }
         }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
    
} 

 
    
       
    

}
