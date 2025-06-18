package com.awesomeapp.module_4_330

sealed class State330_43 {
    data object Loading : State330_43()
    data class Success(val data: String) : State330_43()
    data class Error(val message: String) : State330_43()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}