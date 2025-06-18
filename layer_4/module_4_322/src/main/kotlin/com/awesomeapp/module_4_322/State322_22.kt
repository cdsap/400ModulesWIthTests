package com.awesomeapp.module_4_322

sealed class State322_22 {
    data object Loading : State322_22()
    data class Success(val data: String) : State322_22()
    data class Error(val message: String) : State322_22()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}