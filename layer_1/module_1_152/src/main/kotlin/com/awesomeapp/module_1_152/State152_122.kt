package com.awesomeapp.module_1_152

sealed class State152_122 {
    data object Loading : State152_122()
    data class Success(val data: String) : State152_122()
    data class Error(val message: String) : State152_122()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}