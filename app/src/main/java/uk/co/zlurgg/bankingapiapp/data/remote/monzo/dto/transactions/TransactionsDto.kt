package uk.co.zlurgg.bankingapiapp.data.remote.monzo.dto.transactions


import com.google.gson.annotations.SerializedName

data class TransactionsDto(
    val transactions: List<Transaction>
)