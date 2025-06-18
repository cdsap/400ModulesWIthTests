package com.awesomeapp.module_3_288

sealed class State288_32 {
    data object Loading : State288_32()
    data class Success(val data: String) : State288_32()
    data class Error(val message: String) : State288_32()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}