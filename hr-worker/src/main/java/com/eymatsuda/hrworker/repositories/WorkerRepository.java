package com.eymatsuda.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eymatsuda.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {	

}
