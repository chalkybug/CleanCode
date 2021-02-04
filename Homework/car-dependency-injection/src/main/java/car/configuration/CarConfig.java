package car.configuration;

import car.model.Car;
import car.model.Steering;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfig {
    @Autowired
    private ApplicationContext context;

    @Value("${steeringType}")
    private String steeringType;

    @Bean
    public Car car() {
        Steering steering;
        switch (steeringType) {
            case "autosteering":
                steering = (Steering) context.getBean("autosteering");
                break;
            case "manualsteering":
                steering = (Steering) context.getBean("manualsteering");
                break;
            default:
                steering = (Steering) context.getBean("manualsteering");
        }
        return new Car(steering);
    }
}
