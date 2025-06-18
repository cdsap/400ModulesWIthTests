package com.awesomeapp.module_3_257

sealed class State257_88 {
    data object Loading : State257_88()
    data class Success(val data: String) : State257_88()
    data class Error(val message: String) : State257_88()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}