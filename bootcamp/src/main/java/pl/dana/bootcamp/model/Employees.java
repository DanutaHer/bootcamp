package pl.dana.bootcamp.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Employees {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstName; 
	private String lastName;
	private int phone;
	private String mail;
	@OneToMany(mappedBy = "employees")
	private List<Course> courses;
	
	@ManyToOne
	@JoinColumn(name = "rolee_id")
	private Rolee rolee;
	
	private double salary;
	
}
