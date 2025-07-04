package com.awesomeapp.module_3_308

sealed class State308_32 {
    data object Loading : State308_32()
    data class Success(val data: String) : State308_32()
    data class Error(val message: String) : State308_32()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}