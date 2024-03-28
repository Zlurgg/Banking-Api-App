package uk.co.zlurgg.bankingapiapp.data.remote.monzo.dto.transactions


import com.google.gson.annotations.SerializedName

data class Metadata(
    @SerializedName("faster_payment")
    val fasterPayment: String,
    @SerializedName("fps_fpid")
    val fpsFpid: String,
    @SerializedName("fps_payment_id")
    val fpsPaymentId: String,
    val insertion: String,
    @SerializedName("ledger_committed_timestamp_earliest")
    val ledgerCommittedTimestampEarliest: String,
    @SerializedName("ledger_committed_timestamp_latest")
    val ledgerCommittedTimestampLatest: String,
    val notes: String,
    @SerializedName("open_banking_initiation_id")
    val openBankingInitiationId: String,
    @SerializedName("open_banking_initiation_type")
    val openBankingInitiationType: String,
    @SerializedName("open_banking_initiator")
    val openBankingInitiator: String,
    @SerializedName("open_banking_provider_id")
    val openBankingProviderId: String,
    @SerializedName("standin_correlation_id")
    val standinCorrelationId: String,
    val trn: String
)