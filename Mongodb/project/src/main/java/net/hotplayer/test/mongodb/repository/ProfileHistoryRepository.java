package net.hotplayer.test.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import net.hotplayer.test.mongodb.Profile;

//@Repository
public interface ProfileHistoryRepository extends MongoRepository<Profile, String> {

}
