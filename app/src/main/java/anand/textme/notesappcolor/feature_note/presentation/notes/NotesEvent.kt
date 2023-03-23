package anand.textme.notesappcolor.feature_note.presentation.notes

import anand.textme.notesappcolor.feature_note.domain.model.Note
import anand.textme.notesappcolor.feature_note.domain.util.NoteOrder

sealed class NotesEvent{
    data class Order(val noteOrder: NoteOrder):NotesEvent()
    data class DeleteNote(val note: Note):NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}
