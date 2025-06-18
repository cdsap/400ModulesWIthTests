package com.awesomeapp.module_3_253

sealed class State253_40 {
    data object Loading : State253_40()
    data class Success(val data: String) : State253_40()
    data class Error(val message: String) : State253_40()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}