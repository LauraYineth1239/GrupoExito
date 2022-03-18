package co.com.grupoExito.qa.reto.tasks;

import co.com.grupoExito.qa.reto.userinterfaces.LoginPage;
import co.com.grupoExito.qa.reto.utils.Utils;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginExito implements Task {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoginExito.class);
    private String usuario;
    private String clave;


    public LoginExito(String usuario, String clave) {
        this.usuario = usuario; this.clave = clave;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {   	
    	
        actor.attemptsTo(
                Click.on(LoginPage.BTN_MICUENTA)
                );

        Utils.esperaExplicita(10000L);

        actor.attemptsTo(
                Click.on(LoginPage.BTN_USUARIO_CLAVE),
                Enter.keyValues(usuario).into(LoginPage.INPUT_USUARIO),
                Enter.keyValues(clave).into(LoginPage.INPUT_CLAVE),
                Click.on(LoginPage.BTN_ENTRAR)
        );

        Utils.esperaExplicita(10000L);


        actor.attemptsTo(
                Click.on(LoginPage.BTN_TODAS_CATEGORIAS),
                Click.on(LoginPage.SELECT_MERCADO),
                Enter.keyValues("lechuga").into(LoginPage.INPUT_BUSCAR),
                Click.on(LoginPage.BTN_BUSCAR)
        );


        Utils.esperaExplicita(10000L);

    }
}
