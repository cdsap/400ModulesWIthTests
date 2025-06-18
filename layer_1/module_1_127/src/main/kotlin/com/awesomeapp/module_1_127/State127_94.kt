package com.awesomeapp.module_1_127

sealed class State127_94 {
    data object Loading : State127_94()
    data class Success(val data: String) : State127_94()
    data class Error(val message: String) : State127_94()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}