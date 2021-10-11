package co.edu.udea.calidad.stepsdefinitions;

import co.edu.udea.calidad.questions.TextoDelPrimerElemento;
import co.edu.udea.calidad.tasks.Navigate;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.edu.udea.calidad.userinterface.MainPage.SECCION_ESTUDIANTES;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

public class ProcesoMatriculaStepsDefinitions {

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("estoy en la pagina de la universidad")
    public void estoyEnLaPaginaDeLaUniversidad() {
       theActorCalled("Estudiante").wasAbleTo(Navigate.to("https://www.udea.edu.co/"));
    }

    @When("voy a la seccion de estudiantes")
    public void voyALaSeccionDeEstudiantes() {
        theActorInTheSpotlight().attemptsTo(Click.on(SECCION_ESTUDIANTES));
    }

    @Then("deberia ver la opcion del {string}")
    public void deberiaVerLaOpcionDel(String procesoDeMatricula) {
        theActorInTheSpotlight().should(seeThat(TextoDelPrimerElemento.deLaPagina(), is(procesoDeMatricula)));
    }

}
