package com.awesomeapp.module_3_259

sealed class State259_19 {
    data object Loading : State259_19()
    data class Success(val data: String) : State259_19()
    data class Error(val message: String) : State259_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}