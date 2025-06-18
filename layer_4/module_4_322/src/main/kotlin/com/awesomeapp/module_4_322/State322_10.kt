package com.awesomeapp.module_4_322

sealed class State322_10 {
    data object Loading : State322_10()
    data class Success(val data: String) : State322_10()
    data class Error(val message: String) : State322_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}