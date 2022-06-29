package br.com.portfolio.seven_days_of_code

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import br.com.portfolio.seven_days_of_code.model.User
import br.com.portfolio.seven_days_of_code.ui.theme.SevendaysofcodeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SevendaysofcodeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column() {
                        ImageResource()
                        Perfil(User("Hugo", "hugosimoess", "Dev Kotlin"))
                    }
                }
            }
        }
    }
}

@Composable
fun ImageResource() {
    val image: Painter = painterResource(id = R.drawable.ic_launcher_foreground)
    Image(painter = image,contentDescription = "Foto de Perfil")
}

@Composable
fun Perfil(user: User) {
    Column() {
        Text(user.name)
        Text(user.username)
        Text(user.bio)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SevendaysofcodeTheme {
        Perfil(User("Hugo", "hugosimoess", "Dev Kotlin"))
    }
}