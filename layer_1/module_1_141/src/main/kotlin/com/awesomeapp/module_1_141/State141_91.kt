package com.awesomeapp.module_1_141

sealed class State141_91 {
    data object Loading : State141_91()
    data class Success(val data: String) : State141_91()
    data class Error(val message: String) : State141_91()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}