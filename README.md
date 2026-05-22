Sistema de Juego de Lucha – Refinamiento con Patrones de Diseño

Introducción

El proyecto fue refinado aplicando principios de programación orientada a objetos y patrones de diseño estructurales y de comportamiento, específicamente Decorator y Strategy, con el objetivo de mejorar la flexibilidad, reutilización y mantenibilidad del sistema.

El objetivo principal fue mejorar la mantenibilidad, reutilización y escalabilidad del sistema mediante la implementación del patrón Decorator, permitiendo agregar habilidades y equipamiento dinámicamente a los personajes del juego sin modificar sus clases base.

Adicionalmente, se incorporaron pruebas unitarias utilizando JUnit 5 y Mockito, garantizando el correcto funcionamiento de los métodos implementados y validando el comportamiento esperado del sistema.

Objetivos del proyecto
Objetivo general

Refinar el sistema de juego de lucha aplicando patrones de diseño estructurales y pruebas automatizadas para mejorar la calidad del software.

Objetivos específicos
Implementar el patrón Decorator para agregar habilidades dinámicamente.
Aplicar buenas prácticas de programación orientada a objetos.
Incorporar pruebas unitarias con JUnit 5.
Validar comportamientos mediante assertions.
Utilizar Mockito para simulación de objetos en pruebas.
Automatizar compilación y pruebas con Maven.
Tecnologías utilizadas
Java 17
Maven
JUnit 5
Mockito
JaCoCo
Visual Studio Code
Estructura del proyecto
Patrones_estructurales/
│
├── src/
│   ├── main/java/com/juego/
│   │   ├── personajes/
│   │   ├── decoradores/
│   │   └── Main.java
│   │
│   └── test/java/com/juego/
│       ├── PersonajeBaseTest.java
│       └── EspadaDecoradorTest.java
│
├── target/
├── pom.xml
└── README.md
Patrón de diseño implementado
Patrón Decorator
Permite agregar habilidades y equipamiento a los personajes de manera dinámica sin modificar su estructura principal.

Ejemplo:
- EspadaDecorador
- EscudoDecorador

Patrón Strategy
Permite definir diferentes estrategias de ataque intercambiables durante la ejecución del juego.

Ejemplo:
- AtaqueFuerte
- AtaqueRapido
- IAEnemigo

El patrón Strategy facilita desacoplar la lógica de combate del personaje principal, haciendo el sistema más flexible y extensible.

Para compilar y generar el proyecto:

mvn clean install
Resultados obtenidos

Las pruebas fueron ejecutadas exitosamente obteniendo:

3 pruebas ejecutadas
0 errores
0 fallos
Build Success
Ejecución del proyecto
Desde Visual Studio Code
Abrir la carpeta del proyecto.
Esperar a que Maven cargue las dependencias.
Ejecutar la clase Main.java.
Desde terminal

Compilar:

mvn compile

Ejecutar:

mvn exec:java
Ejemplo de salida
[Espada] Guerrero [Espada] causa 15 puntos extra.
Cobertura de pruebas

Se utilizó JaCoCo para generar reportes de cobertura del código.

Los reportes se generan automáticamente en:

target/site/jacoco/index.html


Conclusiones

La implementación del patrón Strategy permitió separar los diferentes tipos de ataque del comportamiento principal de los personajes, mejorando la extensibilidad del sistema y facilitando futuras modificaciones.