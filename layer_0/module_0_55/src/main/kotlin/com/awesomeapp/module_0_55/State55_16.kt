package com.awesomeapp.module_0_55

sealed class State55_16 {
    data object Loading : State55_16()
    data class Success(val data: String) : State55_16()
    data class Error(val message: String) : State55_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}