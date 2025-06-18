package com.awesomeapp.module_1_125

sealed class State125_25 {
    data object Loading : State125_25()
    data class Success(val data: String) : State125_25()
    data class Error(val message: String) : State125_25()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}