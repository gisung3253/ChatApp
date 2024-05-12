package com.example.chat

data class Message(
    val message: String?,
    val sendId: String?
){

    constructor():this("", "")
}


//chatActivity에서 기능구현