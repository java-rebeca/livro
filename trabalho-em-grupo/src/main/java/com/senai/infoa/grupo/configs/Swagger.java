<<<<<<< HEAD:grupo/src/main/java/com/senai/infoa/grupo/configs/Swagger.java
package com.senai.infoa.grupo.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Bookly",
        version = "1.0",
        description = "Grupo: Isabela Santos, Maria Clara Fonseca, Maria Eduarda Tamancoldi, Rebeca Mendes."
    )
)
public class Swagger {

=======
package com.senai.infoa.grupo.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Exemplo API",
        version = "1.0",
        description = "API para o sistema Exemplo"
    )
)
public class Swagger {

>>>>>>> eb24a4671f729db3554d009448bdfc3b8e66b1a2:src/main/java/com/senai/infoa/grupo/configs/Swagger.java
}