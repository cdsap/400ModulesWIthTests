package com.awesomeapp.module_1_108

sealed class State108_38 {
    data object Loading : State108_38()
    data class Success(val data: String) : State108_38()
    data class Error(val message: String) : State108_38()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}