package com.awesomeapp.module_2_172

sealed class State172_176 {
    data object Loading : State172_176()
    data class Success(val data: String) : State172_176()
    data class Error(val message: String) : State172_176()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}