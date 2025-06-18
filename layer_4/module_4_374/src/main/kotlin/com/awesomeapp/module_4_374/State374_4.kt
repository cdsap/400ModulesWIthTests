package com.awesomeapp.module_4_374

sealed class State374_4 {
    data object Loading : State374_4()
    data class Success(val data: String) : State374_4()
    data class Error(val message: String) : State374_4()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}