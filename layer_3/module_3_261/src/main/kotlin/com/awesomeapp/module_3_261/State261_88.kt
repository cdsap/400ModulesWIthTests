package com.awesomeapp.module_3_261

sealed class State261_88 {
    data object Loading : State261_88()
    data class Success(val data: String) : State261_88()
    data class Error(val message: String) : State261_88()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}