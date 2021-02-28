package com.mrBeanCars.webapp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mrBeanCars.webapp.entity.Cars;

public interface CarRespositories extends JpaRepository<Cars, Long> {

	@Query(value = "select * from Cars c where c.model like %:keyword% or c.colour like %:keyword% or c.price like %:keyword% or c.date_Of_Purchase like %:keyword%", nativeQuery = true)
	public List<Cars> findByKeyword(@Param("keyword") String keyword);

	@Query(value = "select * from Cars c where  c.price between ?1 and ?2", nativeQuery = true)
	public List<Cars> findAllByPriceBetween(@Param("start") int start, @Param("end") int end);

}
