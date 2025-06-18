package com.awesomeapp.module_1_103

sealed class State103_154 {
    data object Loading : State103_154()
    data class Success(val data: String) : State103_154()
    data class Error(val message: String) : State103_154()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}