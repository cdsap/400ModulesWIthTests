package com.awesomeapp.module_1_122

sealed class State122_103 {
    data object Loading : State122_103()
    data class Success(val data: String) : State122_103()
    data class Error(val message: String) : State122_103()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}