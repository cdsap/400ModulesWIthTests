package com.awesomeapp.module_2_165

sealed class State165_31 {
    data object Loading : State165_31()
    data class Success(val data: String) : State165_31()
    data class Error(val message: String) : State165_31()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}