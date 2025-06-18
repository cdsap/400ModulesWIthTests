package com.awesomeapp.module_3_310

sealed class State310_109 {
    data object Loading : State310_109()
    data class Success(val data: String) : State310_109()
    data class Error(val message: String) : State310_109()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}