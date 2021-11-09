package dev.alexfog

import androidx.compose.desktop.DesktopMaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

@Composable
@Preview
fun App() {
    DesktopMaterialTheme {
        Box(modifier = Modifier.fillMaxSize()) {
            val path: String = mainMap()?.let { mapPath(it) } ?: "map-not-found.png"
            Image(
                painterResource(path), "Main Map", Modifier.align(Alignment.Center)
            )
        }
    }
}