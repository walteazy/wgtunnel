package com.zaneschepke.wireguardautotunnel.domain.model

data class AppUpdate(
    val version: String,
    val title: String,
    val releaseNotes: String,
    val apkUrl: String?,
    val apkFileName: String?,
)
