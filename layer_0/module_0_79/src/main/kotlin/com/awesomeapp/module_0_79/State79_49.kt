package com.awesomeapp.module_0_79

sealed class State79_49 {
    data object Loading : State79_49()
    data class Success(val data: String) : State79_49()
    data class Error(val message: String) : State79_49()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}