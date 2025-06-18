package com.awesomeapp.module_4_393

sealed class State393_52 {
    data object Loading : State393_52()
    data class Success(val data: String) : State393_52()
    data class Error(val message: String) : State393_52()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}