package com.awesomeapp.module_1_149

sealed class State149_139 {
    data object Loading : State149_139()
    data class Success(val data: String) : State149_139()
    data class Error(val message: String) : State149_139()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}