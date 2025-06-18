package com.awesomeapp.module_3_241

sealed class State241_19 {
    data object Loading : State241_19()
    data class Success(val data: String) : State241_19()
    data class Error(val message: String) : State241_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}