package com.awesomeapp.module_3_269

sealed class State269_43 {
    data object Loading : State269_43()
    data class Success(val data: String) : State269_43()
    data class Error(val message: String) : State269_43()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}