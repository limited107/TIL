package net.hotplayer.test.mongodb;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;

import net.hotplayer.test.mongodb.repository.ProfileHistoryRepository;

@SpringBootApplication
public class MongodbApplication implements CommandLineRunner {
	@Autowired
	MongoTemplate mongoTemplate;

	@Autowired
	MongoDataAutoConfiguration mongoDataAutoConfiguration;

	@Autowired
	private ProfileHistoryRepository profileHistoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(MongodbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello Mongo");

		for (int i=0; i<100; ++i) {
			List<Profile> profiles = new ArrayList<>();
			for (int j=0; j<1; ++j) {
				Profile profile = new Profile();
				profile.setName("Park");
				profiles.add(profile);
			}

			profileHistoryRepository.saveAll(profiles);
		}
//		List<Profile> profiles = profileHistoryRepository.findAll();
	}
}
