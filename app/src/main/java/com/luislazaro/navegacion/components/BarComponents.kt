package com.luislazaro.navegacion.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.sp

@Composable
fun TittleBar(name: String){
    Text(text = name, fontSize = 25.sp, color = Color.White)
}

@Composable
fun ActionButton(){
    FloatingActionButton(onClick = {/*TODO*/},
        containerColor = Color.Red,
        contentColor = Color.White
        ) {
        Icon(imageVector = Icons.Default.Add,
            contentDescription = "Add")
    }
}

@Composable
fun MainIconButton(
    icon: ImageVector,
    contentDescription: String = "Ícono",
    onClick: () -> Unit
) {
    IconButton(onClick = onClick) {
        Icon(
            imageVector = icon,
            contentDescription = contentDescription,
            tint = Color.White
        )
    }
}