package com.awesomeapp.module_3_302

sealed class State302_46 {
    data object Loading : State302_46()
    data class Success(val data: String) : State302_46()
    data class Error(val message: String) : State302_46()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}