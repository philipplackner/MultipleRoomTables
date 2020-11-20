package com.plcoding.multipleroomtables.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.plcoding.multipleroomtables.entities.Student
import com.plcoding.multipleroomtables.entities.Subject

data class StudentWithSubjects(
    @Embedded val student: Student,
    @Relation(
        parentColumn = "studentName",
        entityColumn = "subjectName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val subjects: List<Subject>
)