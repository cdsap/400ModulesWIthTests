package com.awesomeapp.module_3_286

sealed class State286_67 {
    data object Loading : State286_67()
    data class Success(val data: String) : State286_67()
    data class Error(val message: String) : State286_67()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}