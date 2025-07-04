package com.awesomeapp.module_3_262

sealed class State262_124 {
    data object Loading : State262_124()
    data class Success(val data: String) : State262_124()
    data class Error(val message: String) : State262_124()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}