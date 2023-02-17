package com.nimisaya.languagematters

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.nimisaya.languagematters.annotations.LanguagePreviews
import com.nimisaya.languagematters.ui.theme.LanguageMattersTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LanguageMattersTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column {
        Text(text = stringResource(id = R.string.hello) + name)
        Text(text = stringResource(id = R.string.question_how_are_you))
    }
}

@LanguagePreviews
@Composable
fun DefaultPreview() {
    LanguageMattersTheme {
        Greeting("Android")
    }
}
