package com.awesomeapp.module_2_167

sealed class State167_127 {
    data object Loading : State167_127()
    data class Success(val data: String) : State167_127()
    data class Error(val message: String) : State167_127()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}