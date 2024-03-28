package uk.co.zlurgg.bankingapiapp.domain.model

import uk.co.zlurgg.bankingapiapp.data.remote.monzo.dto.account.Owner
import uk.co.zlurgg.bankingapiapp.data.remote.monzo.dto.account.PaymentDetails

// Class to display specific account data in our list

data class Account(
    val accountNumber: String,
    val closed: Boolean,
    val countryCode: String,
    val created: String,
    val currency: String,
    val description: String,
    val id: String,
    val owners: List<Owner>,
    val paymentDetails: PaymentDetails,
    val sortCode: String,
)