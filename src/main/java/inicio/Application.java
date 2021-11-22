package inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = {"model"})
@EnableJpaRepositories(basePackages = {"dao"})
@ComponentScan (basePackages = {"controller","dao","service"})
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}


//GET: http://localhost:9000/vuelos/1
//POST: http://localhost:9000/vuelos/2/3 NO devuelve nada pero estamos reservando para el vuelo id=2, 3 plazas, quedan disponibles 12
//GET: http://localhost:9000/vuelos/1 No devuelve lo mismo que antes, solo que ahora aparecen 9 plazas disponibles para id=2 , ya que hemos reservado 3