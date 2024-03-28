package uk.co.zlurgg.bankingapiapp.domain.repository

import uk.co.zlurgg.bankingapiapp.data.remote.monzo.dto.account.AccountDto


interface MonzoBankRepository {
    suspend fun getAccounts(): List<AccountDto>
}