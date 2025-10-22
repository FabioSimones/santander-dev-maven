package dev.fabiosimones.santander_dev.domain.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.List;

@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration config = new CorsConfiguration();

        // 🔹 Domínios permitidos — ajuste conforme o seu domínio Railway
        config.setAllowedOriginPatterns(List.of("*"));
        // Exemplo mais restrito: List.of("https://seuapp.up.railway.app")

        // 🔹 Métodos HTTP permitidos
        config.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE", "OPTIONS"));

        // 🔹 Cabeçalhos permitidos
        config.setAllowedHeaders(List.of("*"));

        // 🔹 Permite envio de cookies (se necessário)
        config.setAllowCredentials(true);

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}