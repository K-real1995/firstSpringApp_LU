package Units.Alliance;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DwarfConfig {

    @Bean
    public Dwarf dwarfBean(){
        return new Dwarf();
    }
}
