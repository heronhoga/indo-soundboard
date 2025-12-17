package com.hg.indosoundboard.ui.soundboard

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SoundButton(title: String) {
    ElevatedButton(
        onClick = {

        },
        modifier = Modifier.fillMaxWidth().height(80.dp)
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.titleMedium
        )
    }
}