package com.awesomeapp.module_1_109

sealed class State109_19 {
    data object Loading : State109_19()
    data class Success(val data: String) : State109_19()
    data class Error(val message: String) : State109_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}