package com.example.demojavafx;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField entradaNombre;

    @FXML
    private ChoiceBox titularChoiceBox;

    @FXML
    private ChoiceBox operadorChoiceBox;

    @FXML
    private TextField numeroLineas;

    @FXML
    private TextField tipoPlan;

    @FXML
    private TextField numeroCelular;

    @FXML
    private TextField numeroDNI;

    @FXML
    private TextField planOfrecido;

    @FXML
    private TextField ciudad;

    @FXML
    private TextField distrito;

    @FXML
    private TextField direccion;

    @FXML
    private TextField referenciaDireccion;

    @FXML
    private TextField coordenadasDireccion;

    @FXML
    private TextField lugarNacimiento;

    @FXML
    private TextField nombrePadre;

    @FXML
    private TextField nombreMadre;

    @FXML
    public void limpiarDatos(){
        entradaNombre.setText("");
        titularChoiceBox.setValue(null);
        operadorChoiceBox.setValue(null);
        numeroLineas.setText("");
        tipoPlan.setText("");
        numeroCelular.setText("");
        numeroDNI.setText("");
        ciudad.setText("");
        direccion.setText("");
        referenciaDireccion.setText("");
        coordenadasDireccion.setText("");
    };

}