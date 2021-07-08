package Home.Libraries;

public class Definiciones {

    Reservadas reservadas[] = new Reservadas[16];

    public void inicial(){
        String definicionReservadas = "Palabra reservada";

        reservadas[0] = new Reservadas("String", definicionReservadas);
        reservadas[1] = new Reservadas("static", definicionReservadas);
        reservadas[2] = new Reservadas("System", definicionReservadas);
        reservadas[3] = new Reservadas("case", definicionReservadas);
        reservadas[4] = new Reservadas("catch", definicionReservadas);
        reservadas[5] = new Reservadas("class", definicionReservadas);
        reservadas[6] = new Reservadas("if", definicionReservadas);
        reservadas[7] = new Reservadas("int", definicionReservadas);
        reservadas[8] = new Reservadas("interface", definicionReservadas);
        reservadas[9] = new Reservadas("float", definicionReservadas);
        reservadas[10] = new Reservadas("for", definicionReservadas);
        reservadas[11] = new Reservadas("final", definicionReservadas);
        reservadas[12] = new Reservadas("switch", definicionReservadas);
        reservadas[13] = new Reservadas("try", definicionReservadas);
        reservadas[14] = new Reservadas("public", definicionReservadas);
        reservadas[15] = new Reservadas("extends", definicionReservadas);
    }


    public Reservadas definiciones(String buscar){
        inicial();

        for (int i=0;i<reservadas.length;i++){
            if(reservadas[i].getNombre().equals(buscar)){
                return reservadas[i];
            }
        }
        return null;
    }


}

