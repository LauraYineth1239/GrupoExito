package co.com.grupoExito.qa.reto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {


    private LoginPage() {
    }



    public static final Target BTN_MICUENTA = Target.the("boton para iniciar sesion")
            .locatedBy("//*[@id='Enmascarar_grupo_305']");


    public static final Target BTN_USUARIO_CLAVE = Target.the("boton para abrir formulario login")
            .locatedBy("/html/body/div[14]/div[3]/div[2]/div/div/div/div[1]/div/div/div/div[1]/ul/li[2]/div/button");

    public static final Target INPUT_USUARIO = Target.the("boton para abrir formulario login")
            .locatedBy("/html/body/div[14]/div[3]/div[2]/div/div/div/div[1]/div/div/div/div/form/div[1]/label/div/input");

    public static final Target INPUT_CLAVE = Target.the("boton para abrir formulario login")
            .locatedBy("/html/body/div[14]/div[3]/div[2]/div/div/div/div[1]/div/div/div/div/form/div[2]/div/label/div/input");


    public static final Target BTN_ENTRAR = Target.the("boton para iniciar sesion")
            .locatedBy("/html/body/div[14]/div[3]/div[2]/div/div/div/div[1]/div/div/div/div/form/div[4]/div[2]/button");









    public static final Target BTN_TODAS_CATEGORIAS = Target.the("campo para ingresar el nombre de usuario")
            .locatedBy("//*[@id='header-container']/div[2]/div[3]/div/div[1]/div[1]");

    public static final Target SELECT_MERCADO= Target.the("campo para ingresar el nombre de usuario")
            .locatedBy("//*[@id='mercado']");

    public static final Target INPUT_BUSCAR= Target.the("campo para ingresar el nombre de usuario")
            .locatedBy("//*[@id='downshift-0-input']");

    public static final Target BTN_BUSCAR= Target.the("campo para ingresar el nombre de usuario")
            .locatedBy("//*[@id='header-container']/div[2]/div[3]/div/div[2]/div/div[1]/div/label/div/span/div/button");




    

    
    public static final Target BTN_ENVIAR = Target.the("campo para ingresar el nombre de usuario")
    		.locatedBy("/html/body/app-root/div/div/app-register-request/div/div/div/app-form-register-request/div/div/form/div[4]/div/div[2]/button");
    
    
    
    public static final Target BTN_ACEPTAR = Target.the("campo para ingresar el nombre de usuario")
    		.locatedBy("/html/body/app-root/div/div/app-dashboard/div/app-quick-access/div[2]/div/div/span/button");
    
    

    
    
    
    
    
    
    
    

    public static final Target INPUT_DOCUMENTO = Target.the("campo para ingresar el nombre de usuario")
    		.locatedBy("//*[@id='ctl00_ContentPlaceHolder1_txtNumDocumento']");
    
    
    public static final Target INPUT_NOMBRES = Target.the("campo para ingresar el nombre de usuario")
    		.locatedBy("//*[@name='ctl00$ContentPlaceHolder1$txtNombres']");
    
    
    public static final Target INPUT_APELLIDOS = Target.the("campo para ingresar el nombre de usuario")
    		.locatedBy("//*[@name='ctl00$ContentPlaceHolder1$txtApellidos']");
    

    public static final Target SELECT_DIA_NACIMIENTO= Target.the("campo para ingresar el nombre de usuario")
    		.locatedBy("//*[@id='txt_dia']");
    public static final Target SELECT_MES_NACIMIENTO = Target.the("campo para ingresar el nombre de usuario")
    		.locatedBy("//*[@id='dobmonth']");    
    public static final Target SELECT_AÑO_NACIMIENTO = Target.the("campo para ingresar el nombre de usuario")
    		.locatedBy("//*[@id='txt_anio']");


    
    public static final Target INPUT_TELEFONO = Target.the("campo para ingresar el nombre de usuario")
    		.locatedBy("//*[@id='txtTelefono']");
    
    public static final Target INPUT_CORREO = Target.the("campo para ingresar el nombre de usuario")
    		.locatedBy("//*[@id='txtEmail']");
    
    public static final Target BUTTON_CLAUSULA = Target.the("boton para iniciar sesión")
            .locatedBy("//*[@id='chkTerminos']"); 
    
    public static final Target BUTTON_CONTINUAR= Target.the("boton para iniciar sesión")
    		.locatedBy("//*[@name='btnTemplate']");
    
    public static final Target BUTTON_Cerrar= Target.the("boton para iniciar sesión")
            .locatedBy("/html/body/div[3]/div/div[2]/div[1]"); 
    
}
