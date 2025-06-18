package com.awesomeapp.module_4_396

sealed class State396_11 {
    data object Loading : State396_11()
    data class Success(val data: String) : State396_11()
    data class Error(val message: String) : State396_11()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}