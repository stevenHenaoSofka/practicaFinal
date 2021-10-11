package co.edu.udea.calidad.stepsdefinitions;

import co.edu.udea.calidad.questions.TextoDelTituloDePosgrado;
import co.edu.udea.calidad.tasks.Navigate;
import co.edu.udea.calidad.userinterface.Posgrados;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

public class PosgradosStepsDefinitions {
    @Given("{string} accedió al portal universitario de la gloriosa y poderosísima Universidad de Antioquia")
    public void accedioAlPortalUniversitarioDeLaGloriosaYPoderosisimaUniversidadDeAntioquia(String actor) {
        theActorCalled(actor).wasAbleTo(Navigate.to("https://www.udea.edu.co/"));
    }

    @When("ingresa a la sección de {string} de Quiero estudiar en la UdeA")
    public void ingresaALaSeccionDeDeQuieroEstudiarEnLaUdeA(String posgrado) {
        Posgrados enumPosgrado = Posgrados.valueOf(posgrado.toUpperCase());
        theActorInTheSpotlight().attemptsTo(Click.on(enumPosgrado.obtenerPosgrado()));
    }


    @And("se verifica que el título de la página corresponda con el elegido {string}")
    public void seVerificaQueElTituloDeLaPaginaCorrespondaConElDelPrograma(String posgrado) {
        TextoDelTituloDePosgrado textoDelTituloDePosgrado = new TextoDelTituloDePosgrado(posgrado);

        theActorInTheSpotlight().should(seeThat(textoDelTituloDePosgrado.deLaPagina(), is(posgrado)));
    }
}
