package anand.textme.notesappcolor.feature_note.presentation.notes

import anand.textme.notesappcolor.feature_note.domain.model.Note
import anand.textme.notesappcolor.feature_note.domain.util.NoteOrder
import anand.textme.notesappcolor.feature_note.domain.util.OrderType

data class NotesState(
    val notes:List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible:Boolean = false
)
