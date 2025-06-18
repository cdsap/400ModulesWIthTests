package com.awesomeapp.module_4_348

sealed class State348_17 {
    data object Loading : State348_17()
    data class Success(val data: String) : State348_17()
    data class Error(val message: String) : State348_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}