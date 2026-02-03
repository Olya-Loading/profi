import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.sprint1.R
import com.example.sprint1.presentation.composables.PagerIndicator
import com.example.sprint1.presentation.screen.navigation.Destinations
import com.example.sprint1.presentation.screen.onboarding1.OnBoardingViewModel

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun OnBoarding3Screen(viewModel: OnBoardingViewModel,navController: NavHostController) {
    Scaffold {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(viewModel.onboarding3!!.image),
                contentDescription = "",
                modifier = Modifier.padding(top = 140.dp)
                    .size(240.dp)

            )
            Spacer(modifier = Modifier.height(120.dp))
            PagerIndicator(3, 2)
            Text(
                text = viewModel.onboarding3!!.title,
                modifier = Modifier.padding(top = 30.dp),
                fontSize = 22.sp,

                )
            Box(modifier = Modifier.width(263.dp), contentAlignment = Alignment.Center) {
                Text(
                    text = viewModel.onboarding3!!.text,
                    modifier = Modifier.padding(top = 10.dp, bottom = 50.dp),
                    fontSize = 15.sp,

                    )
            }


            Button(
                onClick = { navController.navigate(Destinations.Language.route) },
                shape = RoundedCornerShape(11.dp),
                modifier = Modifier
                    .width(327.dp)
                    .height(56.dp), colors = ButtonDefaults.buttonColors(Blue)
            ) {
                Text(
                    text = viewModel.onboarding3!!.text_button,
                    fontSize = 21.sp,

                    )
            }
            Text(
                text = "Skip onboarding",
                modifier = Modifier.padding(top = 22.dp),
                fontSize = 15.sp,

                )
        }
    }
}