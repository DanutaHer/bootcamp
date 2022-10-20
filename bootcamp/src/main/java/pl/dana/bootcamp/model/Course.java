package pl.dana.bootcamp.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import pl.dana.bootcamp.enums.Cities;
import pl.dana.bootcamp.enums.Mode;

@AllArgsConstructor
@Builder
@Data
public class Course {
	private Long id;
	private String name; 
	private Cities cities;
	private Mode mode;
	private LocalDate startDate;
	private LocalDate endDate;
	
}
