package uk.co.zlurgg.bankingapiapp.data.remote.monzo.dto.account


import com.google.gson.annotations.SerializedName

data class PaymentDetails(
    val iban: Iban,
    @SerializedName("locale_uk")
    val localeUk: LocaleUk
)