package pl.dana.bootcamp.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import pl.dana.bootcamp.enums.Cities;
import pl.dana.bootcamp.enums.TypMod;

	@AllArgsConstructor
	@Builder
	@Data
	public class Student {
		
		private String firstName; 
		private String lastName;
		private int phone;
		private String mail;
		private Cities city;
		private TypMod typmode;
		private List<Course> courses;
}
	 
