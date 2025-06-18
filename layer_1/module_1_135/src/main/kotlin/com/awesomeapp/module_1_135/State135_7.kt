package com.awesomeapp.module_1_135

sealed class State135_7 {
    data object Loading : State135_7()
    data class Success(val data: String) : State135_7()
    data class Error(val message: String) : State135_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}