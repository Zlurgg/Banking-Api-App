package uk.co.zlurgg.bankingapiapp.data.remote.monzo.dto.transactions


import com.google.gson.annotations.SerializedName

data class Transaction(
    @SerializedName("account_id")
    val accountId: String,
    val amount: Int,
    @SerializedName("amount_is_pending")
    val amountIsPending: Boolean,
    @SerializedName("atm_fees_detailed")
    val atmFeesDetailed: Any,
    val attachments: Any,
    @SerializedName("can_add_to_tab")
    val canAddToTab: Boolean,
    @SerializedName("can_be_excluded_from_breakdown")
    val canBeExcludedFromBreakdown: Boolean,
    @SerializedName("can_be_made_subscription")
    val canBeMadeSubscription: Boolean,
    @SerializedName("can_match_transactions_in_categorization")
    val canMatchTransactionsInCategorization: Boolean,
    @SerializedName("can_split_the_bill")
    val canSplitTheBill: Boolean,
    val categories: Categories,
    val category: String,
    val counterparty: Counterparty,
    val created: String,
    val currency: String,
    @SerializedName("dedupe_id")
    val dedupeId: String,
    val description: String,
    val fees: Fees,
    val id: String,
    @SerializedName("include_in_spending")
    val includeInSpending: Boolean,
    val international: Any,
    @SerializedName("is_load")
    val isLoad: Boolean,
    val labels: Any,
    @SerializedName("local_amount")
    val localAmount: Int,
    @SerializedName("local_currency")
    val localCurrency: String,
    val merchant: Any,
    @SerializedName("merchant_feedback_uri")
    val merchantFeedbackUri: String,
    val metadata: Metadata,
    val notes: String,
    val originator: Boolean,
    @SerializedName("parent_account_id")
    val parentAccountId: String,
    val scheme: String,
    val settled: String,
    val updated: String,
    @SerializedName("user_id")
    val userId: String
)