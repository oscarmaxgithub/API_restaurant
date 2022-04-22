# Getting Started
## Descripcion del proyecto (Back)
Simula un cambio de valores de puntaje basandose en el escenario de tomar data de puntaciones cambiantes de RAPPI.\
Esta desarrollado con JPA para conectarme a una base de datos en memoria (H2), se hacen los insert de data al levantar\
el proyecto,Eureka Client para registrarse en el servidor Eureka como servicio balanceado de carga con Ribbon
### Requisitos
- Tener instalado JDK 11
- Tener instalado un IDE compatible con proyecto Maven (sugerencia: Intellij)
### Orden para levantar la solución
1. Levantar servidor Eureka (para registrar el front como microservicio y el back que es un microservicio) [Descarga AQUI](https://github.com/oscarmaxgithub/serverEurekaFood)
2. Levantar el proyecto Back que se llama API_restaurant y esperar 10 seg a que se registre en Eureka [Descarga AQUI](https://github.com/oscarmaxgithub/API_restaurant)
3. Levantar el proyecto Front que se llama webbatch y esperar 10 seg a que se registre en Eureka [Descarga AQUI](https://github.com/oscarmaxgithub/webbatch)
4. Consultar en un navegador web http://localhost:8002/

### Para futuras mejoras
- Agregar servidor de configuraciones para parametrizar el perfil a levantar DEV o PROD dependiendo de los campos necesarios
- Agregar servidor de frontera para exponer los servicios al front
- Agregar servidor de Autenticacion como Oauth2 para validar los clientes
- Servidor de Logs para trazabilidad

### Flujo de funcionamiento [Mermaid](mermaid.live)
```
graph TD
    C(ServerEureka)
    C -->|Registra| D[API_restaurant]
    D -->|Toma data de| F[pagina de Rappi --Emulacion de cambio en tiempo real--]
    C -->|Registra| E[WebBatch]
    E -->|Se comunica con OpenFeing| D[API_restaurant]
   ```
### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.6/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.6/maven-plugin/reference/html/#build-image)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.6.6/reference/htmlsingle/#boot-features-jpa-and-spring-data)
* [Eureka Discovery Client](https://docs.spring.io/spring-cloud-netflix/docs/current/reference/html/#service-discovery-eureka-clients)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.6.6/reference/htmlsingle/#using-boot-devtools)

### Guides

The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Service Registration and Discovery with Eureka and Spring Cloud](https://spring.io/guides/gs/service-registration-and-discovery/)

