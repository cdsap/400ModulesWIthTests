package com.awesomeapp.module_2_172

sealed class State172_32 {
    data object Loading : State172_32()
    data class Success(val data: String) : State172_32()
    data class Error(val message: String) : State172_32()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}