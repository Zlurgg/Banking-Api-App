package uk.co.zlurgg.bankingapiapp.data.remote.monzo.dto.transactions


import com.google.gson.annotations.SerializedName

data class Counterparty(
    @SerializedName("account_number")
    val accountNumber: String,
    val name: String,
    @SerializedName("sort_code")
    val sortCode: String,
    @SerializedName("user_id")
    val userId: String
)