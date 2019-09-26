package ns.aop;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name = "logging.api.enabled", havingValue = "true", matchIfMissing = true)
public class LogMethodExecutionTimeAutoConfiguration {


   @Bean
    public  LogMethodExecutionTimeAspect getLogMethodExecutionTimeAspect(){
        return  new LogMethodExecutionTimeAspect();
    }



}