package com.awesomeapp.module_1_104

sealed class State104_4 {
    data object Loading : State104_4()
    data class Success(val data: String) : State104_4()
    data class Error(val message: String) : State104_4()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}