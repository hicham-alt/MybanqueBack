package globalProject.demo;

import globalProject.demo.dao.ClientRepository;
import globalProject.demo.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private ClientRepository clientRepository;

	public static void main(String[] args) {

	ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		clientRepository.save(new Client("chakir","hicham.chakir@gmail.com"));
		clientRepository.save(new Client("hicham","hicham.chakir222@gmail.com"));

	}
}
