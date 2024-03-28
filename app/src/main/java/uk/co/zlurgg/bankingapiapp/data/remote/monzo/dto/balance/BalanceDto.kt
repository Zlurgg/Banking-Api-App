package uk.co.zlurgg.bankingapiapp.data.remote.monzo.dto.balance


import com.google.gson.annotations.SerializedName

data class BalanceDto(
    val balance: Int,
    @SerializedName("balance_including_flexible_savings")
    val balanceIncludingFlexibleSavings: Int,
    val currency: String,
    @SerializedName("local_currency")
    val localCurrency: String,
    @SerializedName("local_exchange_rate")
    val localExchangeRate: Int,
    @SerializedName("local_spend")
    val localSpend: List<Any>,
    @SerializedName("spend_today")
    val spendToday: Int,
    @SerializedName("total_balance")
    val totalBalance: Int
)