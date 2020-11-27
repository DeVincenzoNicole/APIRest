package com.Nicole.APIrest.payroll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    // se ejecuta una vez que la app este corriendo
    CommandLineRunner initDatabase(EmployeeRepository repository) {

        // precarga datos de empleados al inicializar
        return args -> {
            log.info("Precargando.. " + repository.save(new Employee("Marcelo Alonso", "Team Leader")));
            log.info("Precargando.. " + repository.save(new Employee("Micaela Cardoso", "Product Owner")));
            log.info("Precargando.. " + repository.save(new Employee("Santiago Perez", "Gerente Financiero")));
            log.info("Precargando.. " + repository.save(new Employee("Ignacio Garcia", "Gerente de Servicios Administrativos")));
            log.info("Precargando.. " + repository.save(new Employee("Martin Casalnovo", "CEO")));
            log.info("Precargando.. " + repository.save(new Employee("María Bermudez", "Recepcionista")));
            log.info("Precargando.. " + repository.save(new Employee("Matias Luna", "Programador")));
            log.info("Precargando.. " + repository.save(new Employee("Ariel Rodriguez", "QA Tester")));
            log.info("Precargando.. " + repository.save(new Employee("Leonardo Sanz", "RRHH")));
            log.info("Precargando.. " + repository.save(new Employee("Carlos Vera", "Ingeniero de Software")));
            log.info("Precargando.. " + repository.save(new Employee("Leonela Ojeda", "Programador")));
            log.info("Precargando.. " + repository.save(new Employee("Ramiro Sosa", "Técnico Electrónico")));
            log.info("Precargando.. " + repository.save(new Employee("Martina Fernandez", "Scrum Master")));
            log.info("Precargando.. " + repository.save(new Employee("Germán Gallardo", "Project Manager")));
        };
    }
}