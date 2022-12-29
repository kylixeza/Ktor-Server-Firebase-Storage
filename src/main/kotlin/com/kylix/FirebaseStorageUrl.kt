package com.kylix

import com.kylix.Constant.STORAGE_BUCKET

object FirebaseStorageUrl {

    const val basePath = ""
    infix fun String.reference(path: String) = "$this$path%2F"

    infix fun String.getDownloadUrl(fileName: String) = run {
        if(this.isEmpty()) {
            return@run "https://firebasestorage.googleapis.com/v0/b/$STORAGE_BUCKET/o/$fileName?alt=media"
        } else {
            return@run "https://firebasestorage.googleapis.com/v0/b/$STORAGE_BUCKET/o/$this$fileName?alt=media"
        }
    }
}