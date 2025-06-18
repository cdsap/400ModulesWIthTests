package com.awesomeapp.module_2_229

sealed class State229_94 {
    data object Loading : State229_94()
    data class Success(val data: String) : State229_94()
    data class Error(val message: String) : State229_94()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}