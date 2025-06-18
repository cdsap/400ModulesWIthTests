package com.awesomeapp.module_2_183

sealed class State183_97 {
    data object Loading : State183_97()
    data class Success(val data: String) : State183_97()
    data class Error(val message: String) : State183_97()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}