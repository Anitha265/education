package com.example.myapplication.model

import java.io.Serializable

data class Subject(
    var subjectName:String?,
    var lastUsed : String?,
    var avatar : String?,
    var description : String?,
    var score:String?,
    ) {
constructor():this (null,null,null,null,null)
}
