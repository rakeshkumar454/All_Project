package com.globallogic.catalog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalog-provider")
public class CatalogController {
	
	@GetMapping("/show/{productNumber}")
	public String showCatalog(@PathVariable Integer productNumber) {
		return "The catalog has "+productNumber+" products in it";
	}

}
