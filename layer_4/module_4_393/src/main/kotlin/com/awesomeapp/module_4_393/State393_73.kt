package com.awesomeapp.module_4_393

sealed class State393_73 {
    data object Loading : State393_73()
    data class Success(val data: String) : State393_73()
    data class Error(val message: String) : State393_73()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}