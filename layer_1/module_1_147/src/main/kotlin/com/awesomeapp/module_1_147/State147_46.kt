package com.awesomeapp.module_1_147

sealed class State147_46 {
    data object Loading : State147_46()
    data class Success(val data: String) : State147_46()
    data class Error(val message: String) : State147_46()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}