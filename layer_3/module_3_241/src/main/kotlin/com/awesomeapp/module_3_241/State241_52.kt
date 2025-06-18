package com.awesomeapp.module_3_241

sealed class State241_52 {
    data object Loading : State241_52()
    data class Success(val data: String) : State241_52()
    data class Error(val message: String) : State241_52()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}