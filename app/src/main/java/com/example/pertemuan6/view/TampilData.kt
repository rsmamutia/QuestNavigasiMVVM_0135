package com.example.pertemuan6.view

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.pertemuan6.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilData(
    onBackBtnClick:()-> Unit
) {
    val items
    Spacer(modifier = Modifier.height(10.dp))
    Button(
        modifier = Modifier.fillMaxWidth(),
        onClick = onBackBtnClick
    ) {
           Text(text = stringResource(id = R.string.back))
    }
}
}