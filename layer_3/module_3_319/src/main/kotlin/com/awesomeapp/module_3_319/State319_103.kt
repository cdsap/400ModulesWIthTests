package com.awesomeapp.module_3_319

sealed class State319_103 {
    data object Loading : State319_103()
    data class Success(val data: String) : State319_103()
    data class Error(val message: String) : State319_103()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}