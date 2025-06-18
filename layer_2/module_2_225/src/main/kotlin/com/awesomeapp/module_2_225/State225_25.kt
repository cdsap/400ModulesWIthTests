package com.awesomeapp.module_2_225

sealed class State225_25 {
    data object Loading : State225_25()
    data class Success(val data: String) : State225_25()
    data class Error(val message: String) : State225_25()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}