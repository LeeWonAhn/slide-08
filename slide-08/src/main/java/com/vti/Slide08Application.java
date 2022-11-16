package com.vti;

import com.vti.entity.Account;
import com.vti.form.AccountCreateForm;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Slide08Application {

	public static void main(String[] args) {
		SpringApplication.run(Slide08Application.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.typeMap(AccountCreateForm.class, Account.class)
				.addMapping(mapper -> mapper.skip(Account::setId));
		return modelMapper;
	}
}
