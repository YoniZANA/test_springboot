package com.example.date_identifiant;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DateController {
	@RequestMapping("/api")
	public LocalDate getDate()
	{
		return LocalDate.now();
	}

	@RequestMapping(value = "/myClass1", method = RequestMethod.GET )
	public Identifiant getIdentifiant()
	{
		Identifiant id = new Identifiant ("Yoni", "Zana", "23 ans", "O");
		return id;
	}
}

