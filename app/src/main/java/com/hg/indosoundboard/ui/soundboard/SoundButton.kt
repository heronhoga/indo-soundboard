package com.hg.indosoundboard.ui.soundboard

import android.media.MediaPlayer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.hg.indosoundboard.R

@Composable
fun SoundButton(
    title: String,
    soundResId: Int
) {
    val context = LocalContext.current

    val mediaPlayer = remember(soundResId) {
        MediaPlayer.create(context, soundResId)
    }

    DisposableEffect(soundResId) {
        onDispose {
            mediaPlayer.release()
        }
    }

    ElevatedButton(
        onClick = {
            mediaPlayer.start()
        },
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.titleMedium
        )
    }
}