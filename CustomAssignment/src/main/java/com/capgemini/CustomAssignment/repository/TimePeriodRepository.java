package com.capgemini.CustomAssignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.CustomAssignment.model.CustomTimePeriod;

@Repository
public interface TimePeriodRepository  extends JpaRepository<CustomTimePeriod, Long> {
	

}
