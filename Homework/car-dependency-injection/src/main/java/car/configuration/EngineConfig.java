package car.configuration;

import car.model.ElectricEngine;
import car.model.GasEngine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EngineConfig {
    @Bean
    public GasEngine gasEngine() {
        return new GasEngine();
    }

    @Bean
    public ElectricEngine electricEngine() {
        return new ElectricEngine();
    }

}
