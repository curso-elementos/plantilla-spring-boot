# plantilla-spring-boot
Plantilla con Spring boot noviembre 2015
## Lo primero es en el pom.xml agregar las siguientes dependencias antes del cierre de la etiqueta **</project>**
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
