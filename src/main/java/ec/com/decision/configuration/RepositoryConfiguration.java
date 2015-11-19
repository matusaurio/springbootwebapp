package ec.com.decision.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by desarrollo on 17/11/15.
 */
@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"ec.com.decision.models"})
@EnableJpaRepositories(basePackages = {"ec.com.decision.repositories"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}
