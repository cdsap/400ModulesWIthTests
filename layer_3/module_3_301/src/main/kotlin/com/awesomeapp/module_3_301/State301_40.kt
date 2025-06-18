package com.awesomeapp.module_3_301

sealed class State301_40 {
    data object Loading : State301_40()
    data class Success(val data: String) : State301_40()
    data class Error(val message: String) : State301_40()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}