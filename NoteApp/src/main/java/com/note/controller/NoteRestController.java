package com.note.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.note.model.NotesDetails;
import com.note.service.INoteService;

@RestController
@RequestMapping("/note")
public class NoteRestController {

	@Autowired
	private INoteService noteService;
	
	@GetMapping("/addnote")
	public ResponseEntity<String> addNoteDetails(@RequestBody NotesDetails note){
		String result = noteService.saveNote(note);
		return new ResponseEntity<String>(result, HttpStatus.OK);
	}
}
