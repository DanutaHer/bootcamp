package pl.dana.bootcamp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class Course {
	private String name;
	private String city;
	

}
