@Login
Feature: deseo iniciar sesion y buscar un producto en exito.com

  Scenario Outline: inicio sesion en exito.com
    Given el ingreso al sitio web <url>
    When ingreso <usuario> y <clave>
    Then valido <usuarioSesion>
      Examples:
      | url    |usuario|clave|usuarioSesion|
      |https://www.exito.com/|ingenieroyefri.r.m@gmail.com|SolangeRuiz8|Hola YEFRI|


