package io.javabrains.springbootstarter.service;

import io.javabrains.springbootstarter.dao.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {}