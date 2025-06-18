package com.awesomeapp.module_4_388

sealed class State388_59 {
    data object Loading : State388_59()
    data class Success(val data: String) : State388_59()
    data class Error(val message: String) : State388_59()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}