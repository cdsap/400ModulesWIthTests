package com.awesomeapp.module_2_229

sealed class State229_88 {
    data object Loading : State229_88()
    data class Success(val data: String) : State229_88()
    data class Error(val message: String) : State229_88()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}