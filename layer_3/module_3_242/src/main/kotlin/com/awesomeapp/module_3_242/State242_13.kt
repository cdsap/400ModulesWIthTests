package com.awesomeapp.module_3_242

sealed class State242_13 {
    data object Loading : State242_13()
    data class Success(val data: String) : State242_13()
    data class Error(val message: String) : State242_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}