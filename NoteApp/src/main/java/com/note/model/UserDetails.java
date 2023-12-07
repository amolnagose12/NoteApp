package com.note.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class UserDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer uId;
	private String uName;
	
	@OneToMany(targetEntity = NotesDetails.class, cascade = CascadeType.ALL, mappedBy = "user")
	
	private List<NotesDetails> notesDetails;
	

}
