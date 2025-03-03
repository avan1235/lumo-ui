package com.nomanr.lumo.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.platform.LocalWindowInfo

@OptIn(ExperimentalComposeUiApi::class)
@Composable
internal actual fun windowContainerWidthInPx(): Int {
    return LocalWindowInfo.current.containerSize.width
}
