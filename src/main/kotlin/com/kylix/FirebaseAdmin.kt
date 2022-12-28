package com.kylix

import com.google.auth.oauth2.GoogleCredentials
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions
import java.io.InputStream

object FirebaseAdmin {
    private val serviceAccount: InputStream? =
        this::class.java.classLoader.getResourceAsStream("admin-key.json")

    private val options: FirebaseOptions = FirebaseOptions.builder()
        .setCredentials(GoogleCredentials.fromStream(serviceAccount))
        .setStorageBucket(Constant.STORAGE_BUCKET)
        .build()

    fun init(): FirebaseApp = FirebaseApp.initializeApp(options)
}