package com.awesomeapp.module_1_113

sealed class State113_103 {
    data object Loading : State113_103()
    data class Success(val data: String) : State113_103()
    data class Error(val message: String) : State113_103()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}