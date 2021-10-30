package com.akshayteli.kotlinsafeargscustomobject

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


/**
 * Created by Akshay Teli on 30,October,2021
 */

@Parcelize
data class Employee(val name: String,val age: String,val address: String ):Parcelable {

}

