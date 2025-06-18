package com.awesomeapp.module_1_122

sealed class State122_139 {
    data object Loading : State122_139()
    data class Success(val data: String) : State122_139()
    data class Error(val message: String) : State122_139()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}