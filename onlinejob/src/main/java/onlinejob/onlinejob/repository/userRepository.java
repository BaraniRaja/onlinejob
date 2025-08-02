package com.onlinejobportal.repository;

import com.onlinejobportal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

// File: src/main/java/com/onlinejobportal/repository/JobRepository.java
package com.onlinejobportal.repository;

import com.onlinejobportal.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}