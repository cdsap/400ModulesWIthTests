package com.awesomeapp.module_3_255

sealed class State255_127 {
    data object Loading : State255_127()
    data class Success(val data: String) : State255_127()
    data class Error(val message: String) : State255_127()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}