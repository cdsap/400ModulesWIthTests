package com.awesomeapp.module_1_113

sealed class State113_139 {
    data object Loading : State113_139()
    data class Success(val data: String) : State113_139()
    data class Error(val message: String) : State113_139()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}