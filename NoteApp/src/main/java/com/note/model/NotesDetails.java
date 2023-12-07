package com.note.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.ManyToAny;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class NotesDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer noteId;
	private String note;
	
	@CreationTimestamp
	private LocalDateTime dateTime;
	
	@ManyToOne(targetEntity = UserDetails.class, cascade = CascadeType.ALL)
	@JoinColumn(name="u_id", referencedColumnName = "uId")
	private UserDetails user;

}

