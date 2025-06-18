package com.awesomeapp.module_1_89

sealed class State89_55 {
    data object Loading : State89_55()
    data class Success(val data: String) : State89_55()
    data class Error(val message: String) : State89_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}