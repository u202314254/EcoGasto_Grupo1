package pe.edu.upc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@OpenAPIDefinition(
        info = @Info(title = "Mi API", version = "1.0"),
        security = { @SecurityRequirement(name = "bearerAuth") }
)
@SecurityScheme(
        name = "bearerAuth",
        type = SecuritySchemeType.HTTP,
        scheme = "bearer",
        bearerFormat = "JWT",
        in = SecuritySchemeIn.HEADER
)
@SpringBootApplication
public class DemoEcoGastoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoEcoGastoApplication.class, args);
    }

}
