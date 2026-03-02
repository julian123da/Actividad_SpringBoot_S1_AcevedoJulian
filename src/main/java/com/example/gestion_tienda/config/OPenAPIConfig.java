package com.example.gestion_tienda.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class OPenAPIConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Gestion API Tienda")
                        .version("1.0")
                        .description("Tablas de los atributos de VENTA, PRODUCTO Y DETALLE VENTA")
                );
    }
}
