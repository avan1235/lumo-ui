package com.nomanr.lumo.multiplatform.sample

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.ComposeViewport
import com.nomanr.lumo.multiplatform.ui.AppTheme
import kotlinx.browser.document

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    ComposeViewport(document.body!!) {
        Box(modifier = Modifier.fillMaxSize().background(AppTheme.colors.background), contentAlignment = Alignment.Center) {
            Box(
                modifier = Modifier.size(size = DpSize(400.dp, 800.dp))
                    .border(5.dp, color = AppTheme.colors.primary, shape = RoundedCornerShape(12.dp))
                    .clip(RoundedCornerShape(12.dp))
            ) { CatalogueApp() }
        }
    }
}