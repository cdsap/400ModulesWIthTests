package com.awesomeapp.module_4_335

sealed class State335_25 {
    data object Loading : State335_25()
    data class Success(val data: String) : State335_25()
    data class Error(val message: String) : State335_25()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}