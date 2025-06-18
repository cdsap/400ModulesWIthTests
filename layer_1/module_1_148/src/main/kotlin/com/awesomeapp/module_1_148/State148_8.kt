package com.awesomeapp.module_1_148

sealed class State148_8 {
    data object Loading : State148_8()
    data class Success(val data: String) : State148_8()
    data class Error(val message: String) : State148_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}