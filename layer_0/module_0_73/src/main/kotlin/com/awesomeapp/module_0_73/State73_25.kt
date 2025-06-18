package com.awesomeapp.module_0_73

sealed class State73_25 {
    data object Loading : State73_25()
    data class Success(val data: String) : State73_25()
    data class Error(val message: String) : State73_25()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}