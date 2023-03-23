package anand.textme.notesappcolor.feature_note.domain.use_case

import anand.textme.notesappcolor.feature_note.domain.model.Note
import anand.textme.notesappcolor.feature_note.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
){
    suspend operator fun invoke(id:Int):Note?{
        return repository.getNoteById(id)
    }
}