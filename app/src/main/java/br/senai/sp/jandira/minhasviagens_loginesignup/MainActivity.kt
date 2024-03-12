package br.senai.sp.jandira.minhasviagens_loginesignup

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.SemanticsProperties.ToggleableState
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import br.senai.sp.jandira.minhasviagens_loginesignup.ui.theme.MinhasViagensLoginESignUpTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MinhasViagensLoginESignUpTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Login()
                    SignUp()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Login() {
    Column (
        Modifier.fillMaxSize()
    ){
        Row (
            horizontalArrangement = Arrangement.End,
            modifier = Modifier.fillMaxWidth()

        ){
            Box (
                Modifier
                    .width(150.dp)
                    .background(Color(0xffcf08ef), shape = RoundedCornerShape(bottomStart = 10.dp))
                    .height(50.dp)
            ){

            }
        }
        Spacer(modifier = Modifier.height(150.dp))
        Column (
            modifier = Modifier.padding(10.dp)
        ){
            Column {
                Text(
                    text = "Login",
                    fontSize = 60.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xffcf08ef)
                )
                Text(
                    text = "Please sign in to continue",
                    fontSize = 20.sp,
                    color = Color.Gray
                )
            }
            Spacer(modifier = Modifier.height(80.dp))
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ){
                OutlinedTextField(
                    modifier = Modifier.width(400.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        unfocusedBorderColor = Color(0xffcf08ef),
                        focusedBorderColor = Color(0xffcf08ef)
                    ),
                    shape = RoundedCornerShape(15.dp),
                    value = "teste@email.com",
                    onValueChange = {},
                    label = {
                        Text(text = "E-mail")
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Filled.Email,
                            contentDescription = "",
                            tint = Color(0xffcf08ef)
                        )
                    }
                )
                Spacer(modifier = Modifier.height(20.dp))
                OutlinedTextField(

                    modifier = Modifier.width(400.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        unfocusedBorderColor = Color(0xffcf08ef),
                        focusedBorderColor = Color(0xffcf08ef)
                    ),
                    shape = RoundedCornerShape(15.dp),
                    value = "**********",
                    onValueChange = {},
                    label = {
                        Text(text = "Password")
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Filled.Lock,
                            contentDescription = "",
                            tint = Color(0xffcf08ef)
                        )
                    }
                )
            }
            Spacer(modifier = Modifier.height(40.dp))
            Column (
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.End
            ){
                Box (
                    modifier = Modifier
                        .background(Color(0xffcf08ef), shape = RoundedCornerShape(20.dp))
                        .height(70.dp)
                        .width(150.dp)
                ){
                    Row (
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .fillMaxHeight()
                            .fillMaxWidth()
                    ){
                        Text(
                            text = "SIGN IN",
                            fontSize = 22.sp,
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.width(10.dp))
                        Icon(
                            imageVector = Icons.Filled.ArrowForward,
                            contentDescription = "",
                            tint = Color.White
                        )
                    }
                }
                Spacer(modifier = Modifier.height(30.dp))
                Row {
                    Text(
                        text = "Don't have an account?",
                        color = Color.Gray
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = "Sign up",
                        color = Color(0xffcf08ef),
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
        Row (
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ){
            Box (
                Modifier
                    .width(150.dp)
                    .background(
                        Color(0xffcf08ef),
                        shape = RoundedCornerShape(topEnd = 10.dp)
                    )
                    .height(50.dp)
            ){

            }
        }
    }
}













@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUp() {
    Column (
        modifier = Modifier
            .fillMaxSize()
    ){
        Row (
            horizontalArrangement = Arrangement.End,
            modifier = Modifier.fillMaxWidth()

        ){
            Box (
                Modifier
                    .width(150.dp)
                    .background(Color(0xffcf08ef), shape = RoundedCornerShape(bottomStart = 10.dp))
                    .height(50.dp)
            ){

            }
        }
        Spacer(modifier = Modifier.height(50.dp))
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ){
            Text(
                text = "Sign up",
                fontSize = 32.sp,
                color = Color(0xffcf08ef),
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Create a new account",
                fontSize = 15.sp,
                color = Color.Gray
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        Box (
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ){
            Image(
                painter = painterResource(id = R.drawable.foto),
                contentDescription = "",
                modifier = Modifier
                    .zIndex(2f)
                    .height(30.dp)
                    .width(30.dp)
                    .offset(x = 35.dp, y = 35.dp)
            )
            Box (
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .height(100.dp)
                    .width(100.dp)
                    .background(Color(0xfff6f6f6), shape = RoundedCornerShape(360.dp))
                    .border(
                        BorderStroke(
                            1.dp,
                            brush = Brush.horizontalGradient(
                                0.0f to Color(0xffcf08ef),
                                0.93f to Color(0xFFffffff),
                                0.2f to Color.White,
                                startX = 0.0f,
                                endX = 300.0f
                            )
                        ), shape = RoundedCornerShape(360.dp)
                    )
            ){
                Image(
                        painter = painterResource(id = R.drawable.perfil),
                        contentDescription = "",
                        modifier = Modifier
                            .height(60.dp)
                            .width(60.dp)
                )
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .fillMaxWidth()
                .height(450.dp)
                .padding(horizontal = 10.dp)
        ) {
            OutlinedTextField(
                shape = RoundedCornerShape(15.dp),
                value = "Susanna Hoffs",
                onValueChange = {},
                label = {
                    Text(text = "Username")
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Face,
                        contentDescription = "",
                        tint = Color(0xffcf08ef)
                    )
                },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    unfocusedBorderColor = Color(0xffcf08ef),
                    focusedBorderColor = Color(0xffcf08ef)
                ),
                modifier = Modifier
                    .width(400.dp)
            )
            OutlinedTextField(
                shape = RoundedCornerShape(15.dp),
                value = "99999-0987",
                onValueChange = {},
                label = {
                    Text(text = "Phone")
                },
                leadingIcon = {
                    Icon(imageVector = Icons.Filled.Call,
                        contentDescription = "",
                        tint = Color(0xffcf08ef)
                    )
                },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    unfocusedBorderColor = Color(0xffcf08ef),
                    focusedBorderColor = Color(0xffcf08ef)
                ),
                modifier = Modifier
                    .width(400.dp)
            )
            OutlinedTextField(
                shape = RoundedCornerShape(15.dp),
                value = "susanna@email.com",
                onValueChange = {},
                label = {
                    Text(text = "E-mail")
                },
                leadingIcon = {
                              Icon(
                                  imageVector = Icons.Filled.Email,
                                  contentDescription = "",
                                  tint = Color(0xffcf08ef)
                              )
                },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    unfocusedBorderColor = Color(0xffcf08ef),
                    focusedBorderColor = Color(0xffcf08ef)
                ),
                modifier = Modifier
                    .width(400.dp)
            )
            OutlinedTextField(
                shape = RoundedCornerShape(15.dp),
                value = "***************",
                onValueChange = {},
                label = {
                    Text(text = "Password")
                },
                leadingIcon = {
                              Icon(
                                  imageVector = Icons.Filled.Lock,
                                  contentDescription = "",
                                  tint = Color(0xffcf08ef)
                                  )
                },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    unfocusedBorderColor = Color(0xffcf08ef),
                    focusedBorderColor = Color(0xffcf08ef)
                ),
                modifier = Modifier
                    .width(400.dp)
            )
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ){
                Box (
                    modifier = Modifier
                        .height(30.dp)
                        .width(30.dp)
                        .background(Color.White)
                        .border(1.dp, Color(0xffcf08ef))
                ){

                }
                Spacer(modifier = Modifier.width(10.dp))
                Text(text = "Over 18?")
            }
            Box (
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(Color(0xffcf08ef), shape = RoundedCornerShape(15.dp))
            ){
                Text(
                    text = "CREATE ACCOUNT",
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(modifier = Modifier.height(12.dp))
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ){
                Text(
                    text = "Already have an account?",
                    color = Color.Gray
                )
                Text(
                    text = "Sign in",
                    color = Color(0xffcf08ef),
                    fontWeight = FontWeight.Bold
                )
            }
        }

        Row (
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ){
            Box (
                Modifier
                    .width(150.dp)
                    .background(
                        Color(0xffcf08ef),
                        shape = RoundedCornerShape(topEnd = 10.dp)
                    )
                    .height(50.dp)
            ){

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MinhasViagensLoginESignUpTheme {
        Login()
    }
}

@Composable
@Preview(showBackground = true)
fun SignInPreview() {
    MinhasViagensLoginESignUpTheme {
        SignUp()
    }
}