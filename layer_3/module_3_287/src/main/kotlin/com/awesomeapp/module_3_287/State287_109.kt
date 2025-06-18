package com.awesomeapp.module_3_287

sealed class State287_109 {
    data object Loading : State287_109()
    data class Success(val data: String) : State287_109()
    data class Error(val message: String) : State287_109()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}