package uk.co.zlurgg.bankingapiapp.presentation.accounts.account_list

import android.os.Build
import androidx.annotation.RequiresExtension
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import uk.co.zlurgg.bankingapiapp.presentation.accounts.account_list.components.AccountListItem

@RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
@Composable
fun AccountListScreen(
    navController: NavController,
    viewModel: AccountViewModel = hiltViewModel()
) {
    val state = viewModel.state.value
    Box(modifier = Modifier.fillMaxSize()) {
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            items(state.accounts) { account ->
                AccountListItem(
                    account = account
                )
            }
        }
    }
}


/*
@RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
@Preview(showBackground = true)
@Composable
fun AccountsListScreenPreview() {
        AccountsListScreen()
}*/
