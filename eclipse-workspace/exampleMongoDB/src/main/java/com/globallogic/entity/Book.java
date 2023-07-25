package com.globallogic.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="book")
public class Book {

	private Integer id;
}
