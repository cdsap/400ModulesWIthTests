package com.awesomeapp.module_1_99

sealed class State99_22 {
    data object Loading : State99_22()
    data class Success(val data: String) : State99_22()
    data class Error(val message: String) : State99_22()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}