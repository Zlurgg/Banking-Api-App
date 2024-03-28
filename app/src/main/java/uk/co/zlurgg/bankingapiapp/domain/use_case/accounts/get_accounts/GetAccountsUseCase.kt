package uk.co.zlurgg.bankingapiapp.domain.use_case.accounts.get_accounts

import android.net.http.HttpException
import android.os.Build
import androidx.annotation.RequiresExtension
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import uk.co.zlurgg.bankingapiapp.common.Resource
import uk.co.zlurgg.bankingapiapp.data.remote.monzo.dto.account.toAccount
import uk.co.zlurgg.bankingapiapp.domain.model.Account
import uk.co.zlurgg.bankingapiapp.domain.repository.MonzoBankRepository
import java.io.IOException
import javax.inject.Inject

class GetAccountsUseCase @Inject constructor(
    private val repository: MonzoBankRepository
) {
    @RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
    operator fun invoke(): Flow<Resource<List<Account>>> = flow {
        try {
            emit(Resource.Loading())
            val accounts = repository.getAccounts().map { it.toAccount() }
            emit(Resource.Success(accounts))
        } catch(e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
        } catch(e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection."))
        }
    }
}