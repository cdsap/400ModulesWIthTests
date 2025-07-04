package com.awesomeapp.module_3_308

sealed class State308_53 {
    data object Loading : State308_53()
    data class Success(val data: String) : State308_53()
    data class Error(val message: String) : State308_53()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}