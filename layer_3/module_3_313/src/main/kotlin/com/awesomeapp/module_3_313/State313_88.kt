package com.awesomeapp.module_3_313

sealed class State313_88 {
    data object Loading : State313_88()
    data class Success(val data: String) : State313_88()
    data class Error(val message: String) : State313_88()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}