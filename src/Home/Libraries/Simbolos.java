package Home.Libraries;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Simbolos {
    protected Pattern p;
    protected Matcher m;
    protected boolean bandera = false;


    public boolean Numeros(String input){
        p = Pattern.compile("0|1|2|3|4|5|6|7|8|9");
        m = p.matcher(input);
        if (m.find()){
            bandera=true;
            System.out.println("numero");
        }else{
            bandera = false;
        }



        return bandera;
    }

    public boolean Letras(String input){
        String matches;
        p = Pattern.compile("[A-Za-z]");
        m = p.matcher(input);
        StringBuffer sb = new StringBuffer();
        boolean resultado = m.find();
        boolean caractereslegales = false;
        while(resultado) {
            caractereslegales = true;
            m.appendReplacement(sb, "");
            resultado = m.find();
        }
        m.appendTail(sb);
        input = sb.toString();
        if (caractereslegales) {
            bandera = true;
            System.out.println("letra");
        }else{
            bandera = false;
        }
        return bandera;
    }

    public boolean SimbolosIlegales(String input){
        p = Pattern.compile("@|#|\\$|%|&|_|!|`|~|\\.|>|<|,|:|'");
        m = p.matcher(input);
        if (m.find()){
            bandera=false;
            System.out.println("ilegal");
        }else{
            bandera = true;
        }
        return bandera;
    }

    public String SimbolosLegales(String input){
        String cadena ="";
        p = Pattern.compile("-|\\+|\\;|\\{|\\}|\\*|\\/|\\(|\\)|\\=");
        m = p.matcher(input);
        StringBuffer sb = new StringBuffer();
        boolean resultado = m.find();
        cadena = cadena +m.group();
        boolean caractereslegales = false;
        while(resultado) {
            caractereslegales = true;
            m.appendReplacement(sb, "");
            resultado = m.find();
            try {
                cadena = cadena + m.group();
            } catch (Exception e) {
            }

        }
        m.appendTail(sb);
        input = sb.toString();
        if (caractereslegales) {
            bandera = true;
            System.out.println("legal");
        }else{
            bandera = false;
        }
        return cadena;
    }
}
