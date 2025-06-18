package com.awesomeapp.module_4_397

sealed class State397_34 {
    data object Loading : State397_34()
    data class Success(val data: String) : State397_34()
    data class Error(val message: String) : State397_34()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}