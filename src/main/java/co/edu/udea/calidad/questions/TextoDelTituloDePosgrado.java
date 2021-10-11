package co.edu.udea.calidad.questions;

import co.edu.udea.calidad.userinterface.TitulosPosgrados;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TextoDelTituloDePosgrado implements Question<String> {

    private final String posgrado;

    public TextoDelTituloDePosgrado(String posgrado) {
        this.posgrado = posgrado;
    }

    public TextoDelTituloDePosgrado deLaPagina() {
        return new TextoDelTituloDePosgrado(posgrado);
    }

    @Override
    public String answeredBy(Actor actor) {
        return TitulosPosgrados.valueOf(posgrado.replace(" ","_").toUpperCase())
                .obtenerTituloPosgrado()
                .resolveFor(actor).getText();
    }
}
