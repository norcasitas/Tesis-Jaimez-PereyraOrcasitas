/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores;

import java.util.Random;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author jjaimez
 */
@WebService(serviceName = "frasesAutores")
public class frasesAutores {
    String[] todas = {"La amistad es un alma que habita en dos cuerpos; un corazón que habita en dos almas.",
    "El ignorante afirma, el sabio duda y reflexiona.",
    "El sabio no dice todo lo que piensa, pero siempre piensa todo lo que dice.",
    "La inteligencia consiste no sólo en el conocimiento, sino también en la destreza de aplicar los conocimientos en la práctica.",
    "La esperanza es el sueño del hombre despierto.",
    "No basta decir solamente la verdad, mas conviene mostrar la causa de la falsedad.",
    "Sólo hay felicidad donde hay virtud y esfuerzo serio, pues la vida no es un juego.",
    "Todos somos muy ignorantes. Lo que ocurre es que no todos ignoramos las mismas cosas.",
    "Si buscas resultados distintos, no hagas siempre lo mismo.",
    "La vida es muy peligrosa. No por las personas que hacen el mal, sino por las que se sientan a ver lo que pasa.",
    "Hay dos cosas infinitas: el Universo y la estupidez humana. Y del Universo no estoy seguro.",
    "Hay una fuerza motriz más poderosa que el vapor, la electricidad y la energía atómica: la voluntad.",
    "Vivimos en el mundo cuando amamos. Sólo una vida vivida para los demás merece la pena ser vivida.",
    "Al principio todos los pensamientos pertenecen al amor. Después, todo el amor pertenece a los pensamientos.",
    "Nuestra recompensa se encuentra en el esfuerzo y no en el resultado. Un esfuerzo total es una victoria completa.",
    "La violencia es el miedo a los ideales de los demás.",
    "La voz interior me dice que siga combatiendo contra el mundo entero, aunque me encuentre solo. Me dice que no tema a este mundo sino que avance llevando en mí nada más que el temor a Dios.",
    "Nadie puede hacer el bien en un espacio de su vida, mientras hace daño en otro. La vida es un todo indivisible.",
    "Ojo por ojo y todo el mundo acabará ciego.",
    "¿Qué es la verdad? Pregunta difícil, pero la he resuelto en lo que a mi concierne diciendo que es lo que te dice tu voz interior."};
    
    String[] aristoteles = {"La amistad es un alma que habita en dos cuerpos; un corazón que habita en dos almas.",
    "El ignorante afirma, el sabio duda y reflexiona.",
    "El sabio no dice todo lo que piensa, pero siempre piensa todo lo que dice.",
    "La inteligencia consiste no sólo en el conocimiento, sino también en la destreza de aplicar los conocimientos en la práctica.",
    "La esperanza es el sueño del hombre despierto.",
    "No basta decir solamente la verdad, mas conviene mostrar la causa de la falsedad.",
    "Sólo hay felicidad donde hay virtud y esfuerzo serio, pues la vida no es un juego."};
    
    String[] einstein = {"Todos somos muy ignorantes. Lo que ocurre es que no todos ignoramos las mismas cosas.",
    "Si buscas resultados distintos, no hagas siempre lo mismo.",
    "La vida es muy peligrosa. No por las personas que hacen el mal, sino por las que se sientan a ver lo que pasa.",
    "Hay dos cosas infinitas: el Universo y la estupidez humana. Y del Universo no estoy seguro.",
    "Hay una fuerza motriz más poderosa que el vapor, la electricidad y la energía atómica: la voluntad.",
    "Vivimos en el mundo cuando amamos. Sólo una vida vivida para los demás merece la pena ser vivida.",
    "Al principio todos los pensamientos pertenecen al amor. Después, todo el amor pertenece a los pensamientos."};
   
    
    String[] gandhi = {"Nuestra recompensa se encuentra en el esfuerzo y no en el resultado. Un esfuerzo total es una victoria completa.",
    "La violencia es el miedo a los ideales de los demás.",
    "La voz interior me dice que siga combatiendo contra el mundo entero, aunque me encuentre solo. Me dice que no tema a este mundo sino que avance llevando en mí nada más que el temor a Dios.",
    "Nadie puede hacer el bien en un espacio de su vida, mientras hace daño en otro. La vida es un todo indivisible.",
    "Ojo por ojo y todo el mundo acabará ciego.",
    "¿Qué es la verdad? Pregunta difícil, pero la he resuelto en lo que a mi concierne diciendo que es lo que te dice tu voz interior."};
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "fraseRandom")
    public String fraseRandom() {
        Random r = new Random();
        int index = r.nextInt(todas.length);
        return todas[index];  
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "frasePorAutor")
    public String frasePorAutor(@WebParam(name = "autor") String autor) {
        if (autor.equals("einstein")){
            Random r = new Random();
            int index = r.nextInt(einstein.length);
            return einstein[index];
        }
        if (autor.equals("gandhi")){
             Random r = new Random();
            int index = r.nextInt(gandhi.length);
            return gandhi[index];
        }
        if (autor.equals("aristoteles")){
             Random r = new Random();
            int index = r.nextInt(aristoteles.length);
            return aristoteles[index];
        }
        return "error";
    }

}
