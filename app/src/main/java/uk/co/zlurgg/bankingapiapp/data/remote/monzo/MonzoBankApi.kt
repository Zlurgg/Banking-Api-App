package uk.co.zlurgg.bankingapiapp.data.remote.monzo

import retrofit2.http.GET
import retrofit2.http.Path
import uk.co.zlurgg.bankingapiapp.data.remote.monzo.dto.account.AccountDto
import uk.co.zlurgg.bankingapiapp.data.remote.monzo.dto.account.AccountsDto
import uk.co.zlurgg.bankingapiapp.data.remote.monzo.dto.transactions.Transaction

interface MonzoBankApi {

    // Define the functions and wraps we want to access from our api
    // https://docs.monzo.com/#introduction
    // https://api.monzo.com/

    // get requests (account(s), transaction(s), balance etc)
    // links to data class for each case in dto

    @GET("/accounts")
    suspend fun getAccounts(): List<AccountDto>

    @GET("/accounts/{account_id}")
    suspend fun getAccountById(): List<AccountsDto>

    // Get transactions by account id
    @GET("/transactions?expand[]=merchant&account_id={account_id}")
    suspend fun getTransactions(@Path("account_id") accountId: String): Transaction

    // Get balance for account by id
    @GET("/balance?account_id={account_id}")
    suspend fun getBalance(@Path("account_id") id: String): AccountDto
}