package com.awesomeapp.module_4_355

sealed class State355_13 {
    data object Loading : State355_13()
    data class Success(val data: String) : State355_13()
    data class Error(val message: String) : State355_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}