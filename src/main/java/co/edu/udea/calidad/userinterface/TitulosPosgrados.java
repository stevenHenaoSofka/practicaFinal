package co.edu.udea.calidad.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public enum TitulosPosgrados {
    ESPECIALIZACIONES {
        @Override
        public Target obtenerTituloPosgrado() {
            return Target.the("Target para el título de la página de Especializaciones.").located(By.xpath("//h2[contains(text(),'Especializaciones')]"));
        }
    }, ESPECIALIDADES_MEDICAS {
        @Override
        public Target obtenerTituloPosgrado() {
            return Target.the("Target para el título de la página de Especialidades Médicas.").located(By.xpath("//h2[contains(text(),'Especialidades médicas')]"));
        }
    }, MAESTRIAS {
        @Override
        public Target obtenerTituloPosgrado() {
            return Target.the("Target para el título de la página de Maestrías.").located(By.xpath("//h2[contains(text(),'Maestrías')]"));
        }
    }, DOCTORADOS {
        @Override
        public Target obtenerTituloPosgrado() {
            return Target.the("Target para el título de la página de Doctorados.").located(By.xpath("//h2[contains(text(),'Doctorados')]"));
        }
    };

    public abstract Target obtenerTituloPosgrado();
}