package com.hg.indosoundboard.ui.soundboard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.hg.indosoundboard.R
import com.hg.indosoundboard.data.model.Sound

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SoundboardScreen() {
    val sounds = listOf(
        Sound(1,"Maling Pangsit", R.raw.sound_maling_pangsit),
        Sound(2, "Hidup Jokowi", R.raw.hidup),
        Sound(3, "Ya Ndak Tau", R.raw.yntkts)
    )
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text("Indonesian Code Sound Board") }
            )
        }
    ) { padding ->
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier
                .padding(padding)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(sounds) { sound ->
                SoundButton(
                    title = sound.name,
                    soundResId = sound.resId
                )
            }
        }
    }

}