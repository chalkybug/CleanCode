package car.configuration;

import car.model.Steering;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SteeringConfig {
    @Bean
    public Steering autosteering() {
        return new Steering("autosteering");
    }

    @Bean
    public Steering manualsteering() {
        return new Steering("manualsteering");
    }

}
