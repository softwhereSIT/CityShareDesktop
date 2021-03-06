/*Classe responsável pela elaboração padrão de máscaras do sistema*/
package br.com.cityshare.components;

import java.text.ParseException;
import javax.swing.text.MaskFormatter;

public class Mascara {
    public MaskFormatter Padrao(String Mascara){
        MaskFormatter masc = new MaskFormatter();
        
        try{
            masc.setMask(Mascara);
            masc.setPlaceholderCharacter(' ');
        }catch (ParseException excecao){
            excecao.printStackTrace();
        }
        return masc;
    }
    
    public static String formatString(String value, String pattern) {
        MaskFormatter mf;
        
        try {
            mf = new MaskFormatter(pattern);
            mf.setValueContainsLiteralCharacters(false);
            return mf.valueToString(value);
        } catch (ParseException ex) {
            return value;
        }
    }
}