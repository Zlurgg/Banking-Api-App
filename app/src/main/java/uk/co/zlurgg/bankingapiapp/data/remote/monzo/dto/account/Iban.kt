package uk.co.zlurgg.bankingapiapp.data.remote.monzo.dto.account


import com.google.gson.annotations.SerializedName

data class Iban(
    val formatted: String,
    val unformatted: String,
    @SerializedName("usage_description")
    val usageDescription: String,
    @SerializedName("usage_description_web")
    val usageDescriptionWeb: String
)