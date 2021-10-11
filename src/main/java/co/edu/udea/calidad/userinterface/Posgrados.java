package co.edu.udea.calidad.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public enum Posgrados {
    ESPECIALIZACIONES{
        @Override
        public Target obtenerPosgrado(){
           return Target.the("Target para el elemento de Posgrado: especialización").located(By.xpath("//body/div[@id='control']/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[3]/section[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[2]/a[2]/span[1]"));
        }
    },
    MAESTRIAS{
        @Override
        public Target obtenerPosgrado(){
           return Target.the("Target para el elemento de Posgrado: maestría").located(By.xpath("//body/div[@id='control']/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[3]/section[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[2]/a[2]/span[1]"));
        }
    },
    DOCTORADOS{
        @Override
        public Target obtenerPosgrado(){
           return Target.the("Target para el elemento de Posgrado: doctorado").located(By.xpath("//body/div[@id='control']/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[3]/section[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[2]/a[5]/span[1]"));
        }
    };

    public abstract Target obtenerPosgrado();
}
