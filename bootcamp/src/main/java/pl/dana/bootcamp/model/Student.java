package pl.dana.bootcamp.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

	@Entity
	@NoArgsConstructor
	@AllArgsConstructor
	@Builder
	@Data
	public class Student {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String firstName; 
		private String lastName;
		private int phone;
		private String mail;
		@ManyToMany
		private List<Course> courses;
		
		@ManyToOne
		@JoinColumn(name = "rolee_id")
		private Rolee rolee;
}
	 
