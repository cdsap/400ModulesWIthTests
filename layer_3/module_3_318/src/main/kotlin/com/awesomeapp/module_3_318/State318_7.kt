package com.awesomeapp.module_3_318

sealed class State318_7 {
    data object Loading : State318_7()
    data class Success(val data: String) : State318_7()
    data class Error(val message: String) : State318_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}