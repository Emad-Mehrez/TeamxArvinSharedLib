import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

actual val firstElement: Int = 1
actual val secondElement: Int = 2

@Preview
@Composable
fun FibPreview() {
    MaterialTheme {
        FibComposable()
    }
}