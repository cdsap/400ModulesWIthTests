package com.awesomeapp.module_2_237

sealed class State237_97 {
    data object Loading : State237_97()
    data class Success(val data: String) : State237_97()
    data class Error(val message: String) : State237_97()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}