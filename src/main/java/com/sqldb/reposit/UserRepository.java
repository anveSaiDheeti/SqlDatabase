package com.sqldb.reposit;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.sqldb.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	public List<User> findByCountry(String cname);

	public List<User> findByAge(Integer age);

	public List<User> findByAgeGreaterThanEqual(Integer age);

	public List<User> findByCountryAndAgeAndGender(String asList, Integer age, String gender);
	
	@Query("From User")
	public List<User> getAllUsersHql();
	@Query("Delete From User  Where userid=:id")
	public List<User> deleteByUserId(Integer id);
}