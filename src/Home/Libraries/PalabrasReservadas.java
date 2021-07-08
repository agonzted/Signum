package Home.Libraries;

import java.lang.ref.SoftReference;

public class PalabrasReservadas {
    String cadena, aux;
    int apuntador=0;
    int estado = 0;
    String palabra;
    String arreglo[] = {"String","static","System","case", "catch", "class", "if", "int", "interface", "float", "for", "final","switch","try","public","extends"};


    public String verificar(String palabra){
        apuntador = 0;
        estado = 0;
        cadena = palabra;
        while (estado!=17){
            switch (estado){
                case 0: palabra = eString(); break;
                case 1: palabra = eStatic(); break;
                case 2: palabra = eSystem(); break;
                case 3: palabra = eSwitch(); break;
                case 4: palabra = eCase(); break;
                case 5: palabra = eTry(); break;
                case 6: palabra = eCatch(); break;
                case 7: palabra = ePublic(); break;
                case 8: palabra = eClass(); break;
                case 9: palabra = eIf(); break;
                case 10: palabra = eInt(); break;
                case 11: palabra = eExtends(); break;
                case 12: palabra = eInterface(); break;
                case 13: palabra = eFloat(); break;
                case 14: palabra = eFor(); break;
                case 15: palabra = eFinal(); break;
                case 16: palabra = e15(); break;
                case 17: eUltimo(); break;
                default: System.out.println("Error inesperasdado");
                return palabra;
            }
        }
        return palabra;
    }

    void moverApuntador(){
        if(apuntador != 15){
            apuntador++;
        }else {
            estado = 17;
            System.out.println("palabra no reconocida");
        }

    }

    String eString(){
        if (arreglo[apuntador].equals(cadena)){
            aux = arreglo[apuntador];
            estado = 16;
            return aux;
        }else {
            moverApuntador();
        }
        return null;
    }

    String eStatic(){
        if (arreglo[apuntador].equals(cadena)){
            aux = arreglo[apuntador];
            estado = 16;
            return aux;
        }else {
            moverApuntador();
        }
        return null;
    }

    String eSystem(){
        if (arreglo[apuntador].equals(cadena)){
            aux = arreglo[apuntador];
            estado = 16;
            return aux;
        }else {
            moverApuntador();
        }
        return null;
    }

    String eSwitch(){
        if (arreglo[apuntador].equals(cadena)){
            aux = arreglo[apuntador];
            estado = 16;
            return aux;
        }else {
            moverApuntador();
        }
        return null;
    }

    String eCase(){
        if (arreglo[apuntador].equals(cadena)){
            aux = arreglo[apuntador];
            estado = 16;
            return aux;
        }else {
            moverApuntador();
        }
        return null;
    }

    String eTry(){
        if (arreglo[apuntador].equals(cadena)){
            aux = arreglo[apuntador];
            estado = 16;
            return aux;
        }else {
            moverApuntador();
        }
        return null;

    }

    String eCatch(){
        if (arreglo[apuntador].equals(cadena)){
            aux = arreglo[apuntador];
            estado = 16;
            return aux;
        }else {
            moverApuntador();
        }
        return null;
    }

    String ePublic(){
        if (arreglo[apuntador].equals(cadena)){
            aux = arreglo[apuntador];
            estado = 16;
            return aux;
        }else {
            moverApuntador();
        }
        return null;
    }

    String eClass(){
        if (arreglo[apuntador].equals(cadena)){
            aux = arreglo[apuntador];
            estado = 16;
            return aux;
        }else {
            moverApuntador();
        }
        return null;
    }

    String eIf(){
        if (arreglo[apuntador].equals(cadena)){
            aux = arreglo[apuntador];
            estado = 16;
            return aux;
        }else {
            moverApuntador();
        }
        return null;
    }

    String eInt(){
        if (arreglo[apuntador].equals(cadena)){
            aux = arreglo[apuntador];
            estado = 16;
            return aux;
        }else {
            moverApuntador();
        }
        return null;

    }

    String eExtends(){
        if (arreglo[apuntador].equals(cadena)){
            aux = arreglo[apuntador];
            estado = 16;
            return aux;
        }else {
            moverApuntador();
        }
        return null;
    }

    String eInterface(){
        if (arreglo[apuntador].equals(cadena)){
            aux = arreglo[apuntador];
            estado = 16;
            return aux;
        }else {
            moverApuntador();
        }
        return null;
    }

    String eFloat(){
        if (arreglo[apuntador].equals(cadena)){
            aux = arreglo[apuntador];
            estado = 16;
            return aux;
        }else {
            moverApuntador();
        }
        return null;
    }

    String eFor(){
        if (arreglo[apuntador].equals(cadena)){
            aux = arreglo[apuntador];
            estado = 16;
            return aux;
        }else {
            moverApuntador();
        }
        return null;
    }

    String eFinal(){
        if (arreglo[apuntador].equals(cadena)){
            aux = arreglo[apuntador];
            estado = 16;
            return aux;
        }else {
            moverApuntador();
        }
        return null;
    }

    String e15(){
        estado = 17;
        return aux;
    }

    void eUltimo(){

    }
}
