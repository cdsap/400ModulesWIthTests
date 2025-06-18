package com.awesomeapp.module_3_313

sealed class State313_52 {
    data object Loading : State313_52()
    data class Success(val data: String) : State313_52()
    data class Error(val message: String) : State313_52()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}