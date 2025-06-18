package com.awesomeapp.module_2_167

sealed class State167_97 {
    data object Loading : State167_97()
    data class Success(val data: String) : State167_97()
    data class Error(val message: String) : State167_97()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}