package com.awesomeapp.module_3_298

sealed class State298_4 {
    data object Loading : State298_4()
    data class Success(val data: String) : State298_4()
    data class Error(val message: String) : State298_4()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}