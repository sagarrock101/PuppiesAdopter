package com.example.pawandroiddevchallenge

import android.graphics.Bitmap
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.content.res.AppCompatResources
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pawandroiddevchallenge.ui.theme.PawAndroidDevChallengeTheme

class MainActivity : AppCompatActivity() {

    var imgRes: Int = 0
    var pupName: String = ""
    var loremIpsum: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        imgRes = intent.getIntExtra("res_id", 0)
        pupName = intent.getStringExtra("pup_name") ?: ""
        loremIpsum = intent.getStringExtra("lorem_ipsum") ?: ""

        setContent {
            PawAndroidDevChallengeTheme {
                NewStory()
            }
        }
    }

    @Composable
    fun NewStory() {
        Surface(color = ListOfDogsActivity.getColor("FBE9D1")) {
            Column(
                Modifier
                    .fillMaxHeight()
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = imgRes),
                    contentDescription = null,
                    modifier = Modifier
                        .height(320.dp)
                        .fillMaxWidth()
                        .fillMaxWidth()
                        .clickable(
                            onClick = {

                            },
                        )
                        .clip(shape = RoundedCornerShape(0.dp, 0.dp, 42.dp, 42.dp)),
                    contentScale = ContentScale.Crop,
                )

                Spacer(modifier = Modifier.height(16.dp))
                Box(modifier = Modifier.padding(16.dp)
                ) {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            pupName,
                            style = typography.h4,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                        Text(
                            "Dog Paradise",
                            style = typography.h5
                        )
                        Text(
                            textAlign = TextAlign.Center,
                            text = loremIpsum,
                            style = typography.body1
                        )
                    }
                }

                Button(onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(backgroundColor = ListOfDogsActivity.getColor("AA724B"))                    ) {
                    Text(text = "Call to adopt")

                }
                Spacer(modifier = Modifier.height(16.dp))


//                Text(
//                    "A day in Shark Fin Cove",
//                    style = typography.h6,
//                    maxLines = 2,
//                    overflow = TextOverflow.Ellipsis
//                )
//                Text(
//                    "Davenport, California",
//                    style = typography.body1
//                )
//                Text(
//                    "December 2018",
//                    style = typography.body2
//                )
            }

        }
    }

    @Preview
    @Composable
    fun DefaultPreview() {
        NewStory()
    }


}

