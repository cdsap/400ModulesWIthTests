package com.awesomeapp.module_3_302

sealed class State302_94 {
    data object Loading : State302_94()
    data class Success(val data: String) : State302_94()
    data class Error(val message: String) : State302_94()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}