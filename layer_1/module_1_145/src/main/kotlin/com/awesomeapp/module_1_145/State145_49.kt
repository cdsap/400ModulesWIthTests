package com.awesomeapp.module_1_145

sealed class State145_49 {
    data object Loading : State145_49()
    data class Success(val data: String) : State145_49()
    data class Error(val message: String) : State145_49()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}