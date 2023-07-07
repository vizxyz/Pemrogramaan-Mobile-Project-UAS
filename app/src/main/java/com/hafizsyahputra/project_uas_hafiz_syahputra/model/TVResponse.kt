package com.hafizsyahputra.project_uas_hafiz_syahputra.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TVResponse(
    @SerializedName("results")
    val tv : List<TV>

) : Parcelable {
    constructor() : this(mutableListOf())
}