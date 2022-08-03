package com.example.myapplication.feature_note.domain.use_case

import com.example.myapplication.feature_note.data.repository.FakeNoteRepositorty
import com.example.myapplication.feature_note.domain.model.InvalidNoteException
import com.example.myapplication.feature_note.domain.model.Note
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertThrows
import org.junit.Before
import org.junit.Test

class AddNoteTest {

    private lateinit var addNote: AddNote
    private lateinit var fakeRepository: FakeNoteRepositorty
    private lateinit var note: Note

    @Before
    fun setUp() {
        fakeRepository = FakeNoteRepositorty()
    }

    @Test
    fun `a blank title from an added note should throw InvalidNoteException`()  {
        addNote = AddNote(fakeRepository)
        note = Note(
            title = "",
            content = "content test",
            timestamp = 2112,
            color = 21
        )

        assertThrows(InvalidNoteException::class.java) {
            runBlocking {
                addNote.invoke(note)
            }
        }
    }

    @Test
    fun `a blank content from an added note should throw InvalidNoteException`()  {
        addNote = AddNote(fakeRepository)
        note = Note(
            title = "title test",
            content = "",
            timestamp = 2112,
            color = 21
        )

        assertThrows(InvalidNoteException::class.java) {
            runBlocking {
                addNote.invoke(note)
            }
        }
    }



}