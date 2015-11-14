# plantilla-spring-boot
Ejercicios
Caso de uso. Una empresa de viajes desea contar con un sistema de reservaciones de hotel para que sus clientes puedan acceder al mismo a través de un sitio web.  Los datos del cliente para hacer una reservación son: Nombre, email, apellido paterno, datos del destino turístico que son ciudad y nombre del hotel, así como número de personas  del cuarto a alquilar, en la reservación también se debe establecer el pago, que únicamente es a través de tarjeta, cuyos datos son nombre de tarjeta, saldo, y número de tarjeta. Como caso de uso para guiarse use lo siguiente: “Reservación a Huatulco para dos personas en el hotel Bahías Huatulco, pago con tarjeta de nómina Banamex cuyo saldo es de 120,000 peso a nombre de Juan Carlos Campos cuyo email es rapidclimategmail.com”. Costo de la habitación para 2 personas: 4000 pesos. Considerando lo anterior desarrollar lo siguiente.

1. Con ayuda del Netbeans crear el MySQL las tablas necesarias que hayan resultado del análisis, Escribir en el examen el código de creación de las tablas. VALOR 2 PUNTOS.
2. Utilizando JPA elaborar el mapeo de las tablas. En las entidades (clases) resultantes implementar el constructor que inicialice los atributos de cada entidad. Escribir en el examen el código de los constructores creados. VALOR 2 PUNTOS.
3. Con ayuda de Hibernate proponer un DAO que se llame DAOReservación, el cual debe de tener los siguientes métodos.
a. Un método que se llame guardar que guarde una reservación. Escribir en el examen todo el código de método VALOR 2 PUNTOS. 
b. Un método que se llame buscarTodos() que regrese en un arreglo genérico a reservación todas lñas reservaciones. Escribe en el examen todo el código de la reservación. VALOR 1 PUNTO.
c. Un método que se llame buscarPorId(Integer id) que obtenga una reservación con base al id proporcionado. Escribir el código en el examen. VALOR 1 PUNTO.
d. Crear un Servlet que acepte el método GET y en su interior invocar el DAO de reservación y guardar desde allí los datos dados como caso de uso al inicio del examen. VALOR 2 PUNTOS.

Plantilla con Spring boot noviembre 2015
## Configuarcion inicial de las dependencias 
 Lo primero que debemos hacer es configurar y agregar las dependencias de spring  en el archivo  **pom.xml**. Debes agregar las siguientes dependencias antes del cierre de la etiqueta ```</project>```
```
<dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>io.spring.platform</groupId>
                <artifactId>platform-bom</artifactId>
                <version>1.0.1.RELEASE</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>

<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
</dependencies>
    <build>
        <resources>
            <resource>
                <directory>${basedir}/src/main/resources</directory>
                <includes>
                    <include>META-INF/**</include>
                    <include>public/**</include>
                    <include>**/*.properties</include>
                </includes>
            </resource>
        </resources>
    </build>
```
