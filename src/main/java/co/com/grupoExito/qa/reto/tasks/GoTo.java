package co.com.grupoExito.qa.reto.tasks;

import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoTo {

    private GoTo() {
    }

    public static Performable iniciarSesion(String usuario, String clave) {
        return instrumented(LoginExito.class, usuario, clave);
    }




}
