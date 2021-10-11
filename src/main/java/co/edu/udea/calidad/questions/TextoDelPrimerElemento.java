package co.edu.udea.calidad.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.edu.udea.calidad.userinterface.SeccionEstudiantes.PRIMER_ELEMENTO_MENU;

public class TextoDelPrimerElemento implements Question<String> {


    public static TextoDelPrimerElemento deLaPagina() {
        return new TextoDelPrimerElemento();
    }

    @Override
    public String answeredBy(Actor actor) {
        return PRIMER_ELEMENTO_MENU.resolveFor(actor).getText();
    }
}
