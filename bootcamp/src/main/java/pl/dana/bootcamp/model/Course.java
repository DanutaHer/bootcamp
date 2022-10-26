package pl.dana.bootcamp.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.dana.bootcamp.enums.Cities;
import pl.dana.bootcamp.enums.TypMod;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name; 
	
	@Enumerated(EnumType.STRING)
	private Cities cities;
	@Enumerated(EnumType.STRING)
	private TypMod typmod;
	
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate startDate;
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate endDate;
	
	private Integer price;
	
}
