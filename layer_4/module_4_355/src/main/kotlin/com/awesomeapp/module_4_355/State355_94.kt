package com.awesomeapp.module_4_355

sealed class State355_94 {
    data object Loading : State355_94()
    data class Success(val data: String) : State355_94()
    data class Error(val message: String) : State355_94()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}