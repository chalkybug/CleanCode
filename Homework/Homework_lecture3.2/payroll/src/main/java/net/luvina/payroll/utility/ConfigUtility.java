package net.luvina.payroll.utility;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:application.properties")
public class ConfigUtility {
    @Value("${language}")
    private String language;

    public String getLanguage() {
        return this.language;
    }

}
