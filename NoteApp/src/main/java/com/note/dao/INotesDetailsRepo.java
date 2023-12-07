package com.note.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.note.model.NotesDetails;

public interface INotesDetailsRepo extends JpaRepository<NotesDetails, Integer>{
	

}
