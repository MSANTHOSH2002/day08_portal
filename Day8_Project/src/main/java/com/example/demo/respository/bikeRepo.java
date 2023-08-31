package com.example.demo.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.bike;

@Repository
public interface bikeRepo extends JpaRepository<bike, Integer>{
	@Query(value="select * from bike_table where year=:y",nativeQuery = true)
	public List<bike> fetchYear(@Param("y")int year);
	@Query(value="select * from bike_table where year=:y or bike_name like %:bn%",nativeQuery = true)
	public List<bike> fetchYearAndBike(@Param("y")int year,@Param("bn")String name);
	@Query(value="select * from bike_table where bike_name like %:bn%",nativeQuery = true)
	public List<bike> fetchBikeName(@Param("bn") String name);
}
