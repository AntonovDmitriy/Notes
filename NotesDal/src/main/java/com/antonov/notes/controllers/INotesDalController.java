package com.antonov.notes.controllers;

import java.util.List;

import com.antonov.notes.entity.Note;

public interface INotesDalController {

	public List<Note> getRecentNotes();
}
