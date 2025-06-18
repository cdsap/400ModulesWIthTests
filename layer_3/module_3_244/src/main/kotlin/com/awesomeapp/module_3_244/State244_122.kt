package com.awesomeapp.module_3_244

sealed class State244_122 {
    data object Loading : State244_122()
    data class Success(val data: String) : State244_122()
    data class Error(val message: String) : State244_122()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}