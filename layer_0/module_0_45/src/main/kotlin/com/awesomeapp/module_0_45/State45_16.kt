package com.awesomeapp.module_0_45

sealed class State45_16 {
    data object Loading : State45_16()
    data class Success(val data: String) : State45_16()
    data class Error(val message: String) : State45_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}