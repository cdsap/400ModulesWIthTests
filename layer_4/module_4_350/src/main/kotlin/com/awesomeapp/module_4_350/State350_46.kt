package com.awesomeapp.module_4_350

sealed class State350_46 {
    data object Loading : State350_46()
    data class Success(val data: String) : State350_46()
    data class Error(val message: String) : State350_46()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}