package org.mahagan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication/* used to mark a configuration class that declare one or more @Bean methods and also trigger autoconfiguration and component scanning*/
public class CrudExampleWithRestApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(CrudExampleWithRestApiApplication.class, args);

    }
}