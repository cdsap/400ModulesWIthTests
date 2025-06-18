package com.awesomeapp.module_2_194

sealed class State194_25 {
    data object Loading : State194_25()
    data class Success(val data: String) : State194_25()
    data class Error(val message: String) : State194_25()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}