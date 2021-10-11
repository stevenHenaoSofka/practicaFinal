package co.edu.udea.calidad.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SeccionEstudiantes {
    public static final Target PRIMER_ELEMENTO_MENU = Target.the("Primer elemento").located(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div[6]/section/div[2]/div[2]/div/div[2]/ul/li[1]/div/p"));
}
