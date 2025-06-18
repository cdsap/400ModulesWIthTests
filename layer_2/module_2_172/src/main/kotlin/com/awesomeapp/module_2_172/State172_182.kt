package com.awesomeapp.module_2_172

sealed class State172_182 {
    data object Loading : State172_182()
    data class Success(val data: String) : State172_182()
    data class Error(val message: String) : State172_182()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}