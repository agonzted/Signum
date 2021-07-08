package Home;

import Home.Libraries.Definiciones;
import Home.Libraries.PalabrasReservadas;
import Home.Libraries.Reservadas;
import Home.Libraries.Simbolos;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    PalabrasReservadas palabra = new PalabrasReservadas();
    Definiciones definiciones = new Definiciones();
    @FXML
    TextArea entrada;
    @FXML
    private TableView<Reservadas> resultado;

    @FXML
    private TableColumn<Reservadas, String> nombre;

    @FXML
    private TableColumn<Reservadas, String> definicion;


    @FXML
    public void enviar(ActionEvent event) throws Exception{
        Simbolos comprobar = new Simbolos();
        String rese;
        String aux = entrada.getText();

        if (comprobar.SimbolosIlegales(aux)==true){

            ObservableList<Reservadas> listaTabla= FXCollections.observableArrayList();
            int cont = 0;
            String palabras[] = aux.split("\\t|\\r\\n|\\n|\\n\\ |\\r|\\ ");
            String arregloAux[] = new String[palabras.length];
            ArrayList<String> identificador = new ArrayList<String>();
            System.out.println(aux);
            for (int i=0; i<palabras.length;i++){
                if(!palabras[i].equals("")){
                    arregloAux[cont] = palabra.verificar(palabras[i]);
                    if(palabra.verificar(palabras[i])==null){
                        identificador.add(palabras[i]);
                    }
                    cont++;

                }
            }
            for (int i = 0; i < arregloAux.length; i++) {
                System.out.println(arregloAux[i]);
            }

            if(comprobar.Letras(aux)==true){
                listaTabla.add(new Reservadas("Letra","Ha introducido al menos una letra"));
            }
            if(comprobar.Numeros(aux)==true){
                listaTabla.add(new Reservadas("Numero","Ha introducido al menos un numero"));
            }
            try{
                char[] simbolos = comprobar.SimbolosLegales(aux).toCharArray();
                for (int i = 0; i < simbolos.length; i++) {
                    listaTabla.add(new Reservadas(String.valueOf(simbolos[i]),"Simbolo reservado"));
                }
            }catch(Exception e){

            }

            for (int i=0; i<arregloAux.length; i++){
                try {
                    System.out.println(rese = definiciones.definiciones(arregloAux[i]).toString());
                    String arregloAux2[] = rese.split("-");
                    listaTabla.add(new Reservadas(arregloAux2[0],arregloAux2[1]));
                }catch (Exception e){

                }

            }

            for (int i = 0; i < identificador.size(); i++) {
                System.out.println(identificador.get(i));
                try{
                    comprobar.SimbolosLegales(identificador.get(i));
                    identificador.remove(i);
                }catch (Exception e){

                }

            }
            for (int i = 0; i < identificador.size(); i++) {
                listaTabla.add(new Reservadas(identificador.get(i),"Identificador"));
            }

            resultado.getItems().removeAll();
            resultado.setItems(listaTabla);
            System.out.println(resultado.getItems().toString());
        }else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Alerta de simbologia");
            alert.setHeaderText("Simbolo erroneo introducido");
            alert.setContentText("Evite usar cualquiera de estos simbolos \n@ # $ % & _ ! ` ~ . > < , : '");

            alert.showAndWait();
        }

    }
    @FXML
    public void cerrar(MouseEvent event){
        Platform.exit();
        System.exit(0);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        nombre.setCellValueFactory(new PropertyValueFactory<Reservadas,String>("nombre"));
        definicion.setCellValueFactory(new PropertyValueFactory<Reservadas,String>("definicion"));

    }
}
