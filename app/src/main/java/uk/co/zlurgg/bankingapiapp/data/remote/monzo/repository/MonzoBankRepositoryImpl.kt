package uk.co.zlurgg.bankingapiapp.data.remote.monzo.repository

import uk.co.zlurgg.bankingapiapp.data.remote.monzo.MonzoBankApi
import uk.co.zlurgg.bankingapiapp.data.remote.monzo.dto.account.AccountDto
import uk.co.zlurgg.bankingapiapp.domain.repository.MonzoBankRepository
import javax.inject.Inject

class MonzoBankRepositoryImpl @Inject constructor(
    private val api: MonzoBankApi
) : MonzoBankRepository {
    override suspend fun getAccounts(): List<AccountDto> {
        return api.getAccounts()
    }

}