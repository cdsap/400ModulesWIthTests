package com.awesomeapp.module_4_342

sealed class State342_4 {
    data object Loading : State342_4()
    data class Success(val data: String) : State342_4()
    data class Error(val message: String) : State342_4()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}