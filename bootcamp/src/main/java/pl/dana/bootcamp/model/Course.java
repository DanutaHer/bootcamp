package pl.dana.bootcamp.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import pl.dana.bootcamp.enums.Cities;
import pl.dana.bootcamp.enums.Mode;

@AllArgsConstructor
@Builder
@Data
public class Course {
	private String name; 
	private Cities cities;
	private Mode mode;
	private Date startDate;
	private Date endDate;
	

}
