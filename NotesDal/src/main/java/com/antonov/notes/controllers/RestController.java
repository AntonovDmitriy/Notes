package com.antonov.notes.controllers;

import java.util.ArrayList;
import java.util.List;

import com.antonov.notes.entity.Note;

public class RestController implements INotesDalController{

	public List<Note> getRecentNotes() {
		
		List<Note> mockResult = new ArrayList<Note>();
		return mockResult;
		
	}

	
}
