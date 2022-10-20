package pl.dana.bootcamp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class Teacher {
	private String firstName; 
	private String lastName;
	private int phone;
	private String mail;
	
	

}
