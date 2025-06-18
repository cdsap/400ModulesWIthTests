package com.awesomeapp.module_0_12

sealed class State12_35 {
    data object Loading : State12_35()
    data class Success(val data: String) : State12_35()
    data class Error(val message: String) : State12_35()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}