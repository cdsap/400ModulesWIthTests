package com.awesomeapp.module_4_348

sealed class State348_44 {
    data object Loading : State348_44()
    data class Success(val data: String) : State348_44()
    data class Error(val message: String) : State348_44()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}