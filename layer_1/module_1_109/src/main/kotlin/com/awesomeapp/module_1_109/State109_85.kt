package com.awesomeapp.module_1_109

sealed class State109_85 {
    data object Loading : State109_85()
    data class Success(val data: String) : State109_85()
    data class Error(val message: String) : State109_85()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}