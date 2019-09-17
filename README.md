# calculator_sanitas
====================

This is a technical test for sanitas

GENERACIÓN DEL JAR
==================
Para poder realizar la generación del jar a traves de Spring Tool Suite se seguirán los siguientes pasos:
- Seleccionar la opción "Run" desde el barra superior
- Selecionar la opción "Run as/Maven build..." aparecerá una ventana para editar la configuración
- En el apartado Goals introducir "clean install" pulsar en "Apply" y para finalizar "Run"

EJECUCIÓN
=========
Para poder levantar la máquina tomcat que proporciona Spring Tool Suite se seguirán los siguientes pasos:
- Seleccionar la opción "Run" desde el barra superior
- Selecionar la opción "Run as/Spring Boot App" aparecerá una ventana para seleccionar la clase a ejecutar, en nuestro caso eligiremos "CalculatorDemoApplication"
- En el apartado "Console" aparecerá el mensaje  "Started CalculatorDemoApplication in 2.844 second", a partir de ahi se podrá enviar peticiones POST desde Postman/SoapUI