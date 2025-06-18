package com.awesomeapp.module_4_350

sealed class State350_10 {
    data object Loading : State350_10()
    data class Success(val data: String) : State350_10()
    data class Error(val message: String) : State350_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}