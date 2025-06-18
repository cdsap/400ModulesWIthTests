package com.awesomeapp.module_3_313

sealed class State313_13 {
    data object Loading : State313_13()
    data class Success(val data: String) : State313_13()
    data class Error(val message: String) : State313_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}