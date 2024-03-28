package uk.co.zlurgg.bankingapiapp.presentation.accounts.account_list

import android.os.Build
import androidx.annotation.RequiresExtension
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import uk.co.zlurgg.bankingapiapp.common.Resource
import uk.co.zlurgg.bankingapiapp.domain.use_case.accounts.get_accounts.GetAccountsUseCase
import javax.inject.Inject

@RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
@HiltViewModel
class AccountViewModel @Inject constructor(
    private val getAccountsUseCase: GetAccountsUseCase
) : ViewModel() {

    private val _state = mutableStateOf(AccountListState())
    val state: State<AccountListState> = _state

    init {
        getAccounts()
    }

    private fun getAccounts() {
        getAccountsUseCase().onEach {  result ->
            when(result) {
                is Resource.Success -> {
                    _state.value = AccountListState(accounts = result.data ?: emptyList())
                }
                is Resource.Loading -> {
                    _state.value = AccountListState(isLoading = true)
                }
                is Resource.Error -> {
                    _state.value = AccountListState(error = result.message ?: "An unexpected error occurred")
                }
            }
        }.launchIn(viewModelScope)
    }

}