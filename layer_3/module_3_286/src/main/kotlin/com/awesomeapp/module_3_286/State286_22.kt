package com.awesomeapp.module_3_286

sealed class State286_22 {
    data object Loading : State286_22()
    data class Success(val data: String) : State286_22()
    data class Error(val message: String) : State286_22()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}