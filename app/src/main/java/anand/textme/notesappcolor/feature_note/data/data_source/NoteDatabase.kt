package anand.textme.notesappcolor.feature_note.data.data_source

import anand.textme.notesappcolor.feature_note.domain.model.Note
import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Note::class],
    version = 1,
    exportSchema = false
)
abstract class NoteDatabase:RoomDatabase() {

    abstract val noteDao:NoteDao
    companion object{
        const val DATABASE_NAME = "notes_db"
    }
}