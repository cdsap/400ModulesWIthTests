package com.awesomeapp.module_3_298

sealed class State298_61 {
    data object Loading : State298_61()
    data class Success(val data: String) : State298_61()
    data class Error(val message: String) : State298_61()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}