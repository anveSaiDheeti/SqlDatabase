package com.sqldb;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sqldb.entity.User;
import com.sqldb.reposit.UserRepository;

@SpringBootApplication
public class SqlDbApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SqlDbApplication.class, args);
		UserRepository repo = context.getBean(UserRepository.class);

		repo.deleteByUserId(105);
		
	}

}
