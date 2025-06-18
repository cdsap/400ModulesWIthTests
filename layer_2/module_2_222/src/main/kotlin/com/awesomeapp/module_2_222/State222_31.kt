package com.awesomeapp.module_2_222

sealed class State222_31 {
    data object Loading : State222_31()
    data class Success(val data: String) : State222_31()
    data class Error(val message: String) : State222_31()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}