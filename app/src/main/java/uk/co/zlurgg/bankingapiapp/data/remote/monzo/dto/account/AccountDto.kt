package uk.co.zlurgg.bankingapiapp.data.remote.monzo.dto.account


import com.google.gson.annotations.SerializedName
import uk.co.zlurgg.bankingapiapp.domain.model.Account

data class AccountDto(
    @SerializedName("account_number")
    val accountNumber: String,
    val closed: Boolean,
    @SerializedName("country_code")
    val countryCode: String,
    val created: String,
    val currency: String,
    val description: String,
    val id: String,
    val owners: List<Owner>,
    @SerializedName("payment_details")
    val paymentDetails: PaymentDetails,
    @SerializedName("sort_code")
    val sortCode: String,
    val type: String
)

fun AccountDto.toAccount(): Account {
    return Account(
        accountNumber = accountNumber,
        closed = closed,
        countryCode = countryCode,
        created = created,
        currency = currency,
        description = description,
        id = id,
        owners = owners,
        paymentDetails = paymentDetails,
        sortCode = sortCode,
    )
}