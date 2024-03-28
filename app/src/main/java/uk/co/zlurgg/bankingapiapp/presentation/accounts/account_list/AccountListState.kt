package uk.co.zlurgg.bankingapiapp.presentation.accounts.account_list

import uk.co.zlurgg.bankingapiapp.domain.model.Account

data class AccountListState(
    val isLoading: Boolean = false,
    val accounts: List<Account> = emptyList(),
    val error: String = ""
)