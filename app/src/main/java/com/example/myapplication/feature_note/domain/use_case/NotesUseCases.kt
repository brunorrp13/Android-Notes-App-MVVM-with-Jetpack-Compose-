package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case

class NotesUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getNote: GetNote
) {
}