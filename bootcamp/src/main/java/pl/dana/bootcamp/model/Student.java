package pl.dana.bootcamp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import pl.dana.bootcamp.enums.Cities;
import pl.dana.bootcamp.enums.Mode;

	@AllArgsConstructor
	@Builder
	@Data
	public class Student {
		
		private String firstName; 
		private String lastName;
		private int phone;
		private String mail;
		private Cities city;
		private Mode mode;
}
