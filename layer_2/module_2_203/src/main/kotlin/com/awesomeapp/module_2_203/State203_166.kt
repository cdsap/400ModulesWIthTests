package com.awesomeapp.module_2_203

sealed class State203_166 {
    data object Loading : State203_166()
    data class Success(val data: String) : State203_166()
    data class Error(val message: String) : State203_166()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}