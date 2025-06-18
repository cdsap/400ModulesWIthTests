package com.awesomeapp.module_2_229

sealed class State229_16 {
    data object Loading : State229_16()
    data class Success(val data: String) : State229_16()
    data class Error(val message: String) : State229_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}