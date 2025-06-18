package com.awesomeapp.module_4_343

sealed class State343_130 {
    data object Loading : State343_130()
    data class Success(val data: String) : State343_130()
    data class Error(val message: String) : State343_130()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}