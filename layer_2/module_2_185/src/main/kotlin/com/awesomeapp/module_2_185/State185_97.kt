package com.awesomeapp.module_2_185

sealed class State185_97 {
    data object Loading : State185_97()
    data class Success(val data: String) : State185_97()
    data class Error(val message: String) : State185_97()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}