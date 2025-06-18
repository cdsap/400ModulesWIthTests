package com.awesomeapp.module_3_319

sealed class State319_85 {
    data object Loading : State319_85()
    data class Success(val data: String) : State319_85()
    data class Error(val message: String) : State319_85()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}