package com.awesomeapp.module_4_393

sealed class State393_109 {
    data object Loading : State393_109()
    data class Success(val data: String) : State393_109()
    data class Error(val message: String) : State393_109()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}