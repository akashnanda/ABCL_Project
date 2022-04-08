package com.assignment.db;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.model.ImageModel;

public interface ImageRepository extends JpaRepository<ImageModel, Long> {
	Optional<ImageModel> findByName(String name);
}
