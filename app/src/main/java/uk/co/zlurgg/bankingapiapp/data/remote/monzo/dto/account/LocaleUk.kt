package uk.co.zlurgg.bankingapiapp.data.remote.monzo.dto.account


import com.google.gson.annotations.SerializedName

data class LocaleUk(
    @SerializedName("account_number")
    val accountNumber: String,
    @SerializedName("sort_code")
    val sortCode: String
)