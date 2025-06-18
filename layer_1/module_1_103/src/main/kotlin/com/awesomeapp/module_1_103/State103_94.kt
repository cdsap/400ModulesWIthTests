package com.awesomeapp.module_1_103

sealed class State103_94 {
    data object Loading : State103_94()
    data class Success(val data: String) : State103_94()
    data class Error(val message: String) : State103_94()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}