package com.awesomeapp.module_3_286

sealed class State286_31 {
    data object Loading : State286_31()
    data class Success(val data: String) : State286_31()
    data class Error(val message: String) : State286_31()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}