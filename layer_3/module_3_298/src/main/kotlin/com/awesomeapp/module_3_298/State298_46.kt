package com.awesomeapp.module_3_298

sealed class State298_46 {
    data object Loading : State298_46()
    data class Success(val data: String) : State298_46()
    data class Error(val message: String) : State298_46()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}