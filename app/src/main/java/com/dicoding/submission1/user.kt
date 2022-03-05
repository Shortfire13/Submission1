package com.dicoding.submission1

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class user(
    var name: String,
    var username: String,
    var avatar: Int,
    var location: String,
    var repository: String,
    var company: String,
    var following: String,
    var followers: String,
) : Parcelable
