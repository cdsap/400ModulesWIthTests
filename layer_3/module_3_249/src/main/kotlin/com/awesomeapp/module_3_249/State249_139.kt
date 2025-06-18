package com.awesomeapp.module_3_249

sealed class State249_139 {
    data object Loading : State249_139()
    data class Success(val data: String) : State249_139()
    data class Error(val message: String) : State249_139()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}