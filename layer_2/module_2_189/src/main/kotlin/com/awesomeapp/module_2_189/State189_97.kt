package com.awesomeapp.module_2_189

sealed class State189_97 {
    data object Loading : State189_97()
    data class Success(val data: String) : State189_97()
    data class Error(val message: String) : State189_97()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}