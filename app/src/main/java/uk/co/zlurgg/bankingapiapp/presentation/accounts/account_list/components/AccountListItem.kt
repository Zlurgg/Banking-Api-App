package uk.co.zlurgg.bankingapiapp.presentation.accounts.account_list.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import uk.co.zlurgg.bankingapiapp.domain.model.Account

@Composable
fun AccountListItem(
    account: Account,
//    onItemClick: (Account) -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
//            .clickable { onItemClick(account) }
            .padding(20.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "${account.id}",
            style = MaterialTheme.typography.bodyLarge,
            overflow = TextOverflow.Ellipsis
        )
    }
}