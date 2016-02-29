/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frases;

import java.util.Calendar;
import java.util.Random;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;



@WebService(serviceName = "frases")
public class frases {
    String[] frs = {"No hay más que un poder: la conciencia al servicio de la justicia; no hay más que una gloria: el genio, el servicio de la verdad.\n - Victor Hugo",
        "Cuando alguien desea algo debe saber que corre riesgos y por eso la vida vale la pena.\n -Paulo Coelho",
        "Que la comida sea tu alimento y el alimento tu medicina.\n -Hipócrates",
        "Sólo hay dos palancas que muevan a los hombres: el miedo y el interés.\n -Napoleón I",
    "El día que la mierda tenga algún valor, los pobres nacerán sin culo.\n -Gabriel García Márquez",
        "Al perro que tiene dinero se le llama señor perro.\n - Proverbio árabe",
    "Cuando la vida te presente razones para llorar, demuéstrale que tienes mil y una razones para reír.",
        "La vida es muy peligrosa. No por las personas que hacen el mal, sino por las que se sientan a ver lo que pasa.",
        "Al final, lo que importa no son los años de vida, sino la vida de los años.",
        "Estar preparado es importante, saber esperar lo es aún más, pero aprovechar el momento adecuado es la clave de la vida.",
        "La vida no se ha hecho para comprenderla, sino para vivirla.",
    "Antes de poner en duda el buen juicio de tu mujer, fíjate con quien se ha casado ella.",
    "Elige una mujer de la cual puedas decir: Yo hubiera podido buscarla más bella pero no mejor.",
    "Las cadenas de la esclavitud solamente atan las manos: es la mente lo que hace al hombre libre o esclavo.",
    "Las batallas contra las mujeres son las únicas que se ganan huyendo.",
    "Si usted quiere saber lo que una mujer dice realmente, mírela, no la escuche."}; 
    
    
    String[] naturaleza = {"Cuando la vida te presente razones para llorar, demuéstrale que tienes mil y una razones para reír.",
        "La vida es muy peligrosa. No por las personas que hacen el mal, sino por las que se sientan a ver lo que pasa.",
        "Al final, lo que importa no son los años de vida, sino la vida de los años.",
        "Estar preparado es importante, saber esperar lo es aún más, pero aprovechar el momento adecuado es la clave de la vida.",
        "La vida no se ha hecho para comprenderla, sino para vivirla."};
    
    String[] sociedad = {"Antes de poner en duda el buen juicio de tu mujer, fíjate con quien se ha casado ella.",
    "Elige una mujer de la cual puedas decir: Yo hubiera podido buscarla más bella pero no mejor.",
    "Las cadenas de la esclavitud solamente atan las manos: es la mente lo que hace al hombre libre o esclavo.",
    "Las batallas contra las mujeres son las únicas que se ganan huyendo.",
    "Si usted quiere saber lo que una mujer dice realmente, mírela, no la escuche."};
    /**
     * frase del dia
     */
    @WebMethod(operationName = "fraseDelDia")
    public String fraseDelDia() {
        Calendar cal = Calendar.getInstance();
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        if (frs.length < dayOfMonth){
            int i = frs.length-1;
            return frs[i];
        } else {
            return frs[dayOfMonth];
        }
    }

    /**
     * frase random
     */
    @WebMethod(operationName = "fraseRandom")
    public String fraseRandom() {
        Random r = new Random();
       int index = r.nextInt(frs.length);
        return frs[index];
    }

    /**
     * frase por categoria o tematica
     */
    @WebMethod(operationName = "frasePorCategoria")
    public String frasePorCategoria(@WebParam(name = "categoria") String categoria) {
       if (categoria.equals("sociedad")){
            Random r = new Random();
            int index = r.nextInt(sociedad.length);
            return sociedad[index];
       }
       if (categoria.equals("naturaleza")){
            Random r = new Random();
            int index = r.nextInt(naturaleza.length);
            return naturaleza[index];
       }
       return "error";
    }
}
