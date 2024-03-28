package uk.co.zlurgg.bankingapiapp.presentation

sealed class Screen(val route: String) {
    data object AccountListScreen: Screen("account_list_screen")
}