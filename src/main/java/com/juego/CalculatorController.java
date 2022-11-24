package com.juego;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
public class CalculatorController {

    
    @FXML
    private Label tfCantidad1;
    @FXML
    private Label tfCantidad2;
    @FXML
    private Label lblResultadoB;
    @FXML
    private TextField resultadoUsuario;
    @FXML
    private Label Resultado;

    // Resta
    @FXML
    private Label tfresta1;
    @FXML
    private Label tfresta2;
    @FXML
    private TextField resultadoRestaUsuario;
    @FXML
    private Label ResultadoR;
    // Mutiplicación
    @FXML
    private Label tfmulti1;
    @FXML
    private Label tfmulti2;
    @FXML
    private TextField resultadoMultiUsuario;
    @FXML
    private Label ResultadoX;
    

    @FXML
    private void aleatorio() {

        //Dinosaurio.setFitWidth(0);
        // suma aleatorio
        int cantidad1 = (int) (Math.random() * 10 + 1);
        String numero1 = String.valueOf(cantidad1);
        tfCantidad1.setText(numero1);

        int cantidad2 = (int) (Math.random() * 10 + 1);
        String numero2 = String.valueOf(cantidad2); // value Of--> convierte de int a string
        tfCantidad2.setText(numero2);

        // Resta Aleatorio

        int numeroa = (int) (Math.random() * 10 + 1);
        String numeroaa = String.valueOf(numeroa);
        tfresta1.setText(numeroaa);

        int numerob = (int) (Math.random() * 10 + 1);
        String numerobb = String.valueOf(numerob); // value Of--> convierte de int a string
        tfresta2.setText(numerobb);

        // multi Aleatorio

        int numea = (int) (Math.random() * 10 + 1);
        String numeaa = String.valueOf(numea);
        tfmulti1.setText(numeaa);

        int numeb = (int) (Math.random() * 10 + 1);
        String numebb = String.valueOf(numeb); // value Of--> convierte de int a string
        tfmulti2.setText(numebb);

    }

    // SUMA
    @FXML // siempre se debe colocar la etiqueta para que se enlace @FXML
    private void BotoonTwo() {

        try {
            String cantidad1 = tfCantidad1.getText().trim(); // guardo un label en un string
            String cantidad2 = tfCantidad2.getText().trim(); // guardo un label en un string
            int number = Integer.parseInt(cantidad1); // parseInt --> de string a int
            int number2 = Integer.parseInt(cantidad2); // parseInt --> de string a int

            int sumando = number + number2;

            String deString_int = resultadoUsuario.getText().trim(); // obtengo el resultado del usuario
            int l = Integer.parseInt(deString_int); // y lo guado en una variable de tipo int //parseInt --> de string a
                                                    // int
            printResult(Resultado, l == sumando);
       
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
    }

    // Resta
    @FXML
    private void BotoonRest() {

        try {
            String numeroa = tfresta1.getText().trim(); // guardo un label en un string
            String numeroaa = tfresta2.getText().trim(); // guardo un label en un string
            int number = Integer.parseInt(numeroa); // parseInt --> de string a int
            int number2 = Integer.parseInt(numeroaa); // parseInt --> de string a int

            int restando = number - number2;

            String deString_int = resultadoRestaUsuario.getText().trim(); // obtengo el resultado del usuario
            int l = Integer.parseInt(deString_int); // y lo guado en una variable de tipo int //parseInt --> de string a
                                                    // int

            printResult(ResultadoR, l == restando);

        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
    }

    // Multiplicación
    @FXML
    private void BotoonMultiplication() {

        try {
            String numea = tfmulti1.getText().trim(); // guardo un label en un string
            String numeaa = tfmulti2.getText().trim(); // guardo un label en un string
            int number = Integer.parseInt(numea); // parseInt --> de string a int
            int number2 = Integer.parseInt(numeaa); // parseInt --> de string a int

            int Multiplicacion = number * number2;

            String deString_int = resultadoMultiUsuario.getText().trim(); // obtengo el resultado del usuario
            int l = Integer.parseInt(deString_int); // y lo guado en una variable de tipo int //parseInt --> de string a
                                                    // int

            printResult(ResultadoX, l == Multiplicacion);

        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
    }

    private void printResult(Label control, Boolean result) {
        if (result) {
            control.setText("Correcto");
            
            control.setTextFill(Color.GREEN);
           
        }
        else {
            control.setText("Incorrecto");
            control.setTextFill(Color.RED);
        }

    }

}
