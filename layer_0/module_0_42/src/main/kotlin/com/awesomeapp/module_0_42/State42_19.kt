package com.awesomeapp.module_0_42

sealed class State42_19 {
    data object Loading : State42_19()
    data class Success(val data: String) : State42_19()
    data class Error(val message: String) : State42_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}