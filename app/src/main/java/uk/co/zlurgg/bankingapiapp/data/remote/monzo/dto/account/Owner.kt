package uk.co.zlurgg.bankingapiapp.data.remote.monzo.dto.account


import com.google.gson.annotations.SerializedName

data class Owner(
    @SerializedName("preferred_first_name")
    val preferredFirstName: String,
    @SerializedName("preferred_name")
    val preferredName: String,
    @SerializedName("user_id")
    val userId: String
)