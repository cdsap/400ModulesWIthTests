package com.awesomeapp.module_3_249

sealed class State249_97 {
    data object Loading : State249_97()
    data class Success(val data: String) : State249_97()
    data class Error(val message: String) : State249_97()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}