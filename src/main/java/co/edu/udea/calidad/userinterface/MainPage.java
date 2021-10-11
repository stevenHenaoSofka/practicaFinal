package co.edu.udea.calidad.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MainPage {
    public static final Target SECCION_ESTUDIANTES = Target.the("Seccion estudiantes").located(By.xpath("/html/body/div/div[1]/div/div[3]/div/div[2]/div/div[1]/section/div[2]/div[2]/div[1]/button[1]/span"));
}
