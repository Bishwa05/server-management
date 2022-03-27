package com.server.management;

import com.server.management.enumeration.Status;
import com.server.management.model.Server;
import com.server.management.repo.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagementApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ServerRepo serverRepo) {
		return args -> {
			serverRepo.save(new Server(null, "192.168.1.100", "Ubuntu Linux", "16 GB", "PersonalPC",
					"http://localhost:8080/server/image/server1.png", Status.SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.50", "Fedora Linux", "16 GB", "PersonalPC",
					"http://localhost:8080/server/image/server2.png", Status.SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.90", "MS Server", "16 GB", "PersonalPC",
					"http://localhost:8080/server/image/server3.png", Status.SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.21", "Red Hat Enterprise Linux", "16 GB", "PersonalPC",
					"http://localhost:8080/server/image/server4.png", Status.SERVER_UP));
		};
	}
}
