package com.awesomeapp.module_3_315

sealed class State315_94 {
    data object Loading : State315_94()
    data class Success(val data: String) : State315_94()
    data class Error(val message: String) : State315_94()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}