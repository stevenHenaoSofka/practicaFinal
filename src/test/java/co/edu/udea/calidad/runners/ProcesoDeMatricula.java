package co.edu.udea.calidad.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/posgrados.feature",
                glue = "co.edu.udea.calidad.stepsdefinitions",
                snippets = SnippetType.CAMELCASE,
                tags={"@Posgrados"})
public class ProcesoDeMatricula {
}
