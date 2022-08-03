package com.example.myapplication.feature_note.domain.use_case

import com.example.myapplication.feature_note.domain.use_case.AddNote
import com.example.myapplication.feature_note.domain.use_case.DeleteNote
import com.example.myapplication.feature_note.domain.use_case.GetNote
import com.example.myapplication.feature_note.domain.use_case.GetNotes

class NotesUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getNote: GetNote
) {
}