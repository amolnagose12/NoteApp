package com.note.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.note.dao.INotesDetailsRepo;
import com.note.model.NotesDetails;

@Service
public class NoteServiceImpl implements INoteService {
	
	@Autowired
	private INotesDetailsRepo noteRepo;

	@Override
	public String saveNote(NotesDetails note) {
		Integer id = noteRepo.save(note).getNoteId();
		return "Note saved with id " + id;
	}
	
	

	
}
