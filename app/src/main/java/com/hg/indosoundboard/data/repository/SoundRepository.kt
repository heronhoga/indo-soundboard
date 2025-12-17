package com.hg.indosoundboard.data.repository

import com.hg.indosoundboard.R
import com.hg.indosoundboard.data.model.Sound

class SoundRepository {
    fun getSounds(): List<Sound> = listOf(
        Sound(1, "maling_pangsit", R.raw.sound_maling_pangsit),
        Sound(2, "hidup_j", R.raw.hidup),
        Sound(3, "yntkts", R.raw.yntkts)
    )
}