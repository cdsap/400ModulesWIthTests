package com.awesomeapp.module_3_257

sealed class State257_55 {
    data object Loading : State257_55()
    data class Success(val data: String) : State257_55()
    data class Error(val message: String) : State257_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}