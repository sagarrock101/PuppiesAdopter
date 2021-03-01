package com.example.pawandroiddevchallenge

import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import com.example.pawandroiddevchallenge.ui.theme.PawAndroidDevChallengeTheme

class ListOfDogsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scaffold(topBar = {
                TopAppBar(
                    title = { Text("Puppies Adopter") }, elevation = 12.dp,
                    backgroundColor = getColor("6b441f")
                )
            },
                content = {
                    MyApp {
                        MyScreenContent(names = getPuppies())
                    }
                }
            )

        }
    }

    companion object {

        fun getPuppies(): List<Puppy> {
            var list = ArrayList<Puppy>()
            list.add(
                Puppy(
                    "Beagle",
                    R.drawable.beagle_puppy_png,
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque lorem neque, pharetra bibendum turpis ut, sodales pellentesque nisl. Morbi cursus hendrerit efficitur. Nulla efficitur eleifend mattis. Morbi metus dui, tincidunt vitae sodales non, lobortis sit amet sem. Pellentesque quis molestie ex, at cursus nisl. Aenean laoreet ante vitae sapien convallis ullamcorper. Suspendisse malesuada nibh ut fringilla egestas. Etiam pretium nibh id dolor mollis, sed malesuada elit consequat. Maecenas sed lectus nec lectus auctor iaculis. Morbi lectus massa, euismod blandit ante et, fringilla malesuada leo. Duis maximus scelerisque nulla id consequat. Cras pulvinar efficitur erat, ac luctus mi. Quisque varius fringilla orci, sit amet laoreet ante accumsan sit amet. Mauris congue porta tellus, a vehicula tellus consequat in. Sed at elit justo"
                )
            )
            list.add(
                Puppy(
                    "Boxer",
                    R.drawable.boxer_puppy,
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque lorem neque, pharetra bibendum turpis ut, sodales pellentesque nisl. Morbi cursus hendrerit efficitur. Nulla efficitur eleifend mattis. Morbi metus dui, tincidunt vitae sodales non, lobortis sit amet sem. Pellentesque quis molestie ex, at cursus nisl. Aenean laoreet ante vitae sapien convallis ullamcorper. Suspendisse malesuada nibh ut fringilla egestas. Etiam pretium nibh id dolor mollis, sed malesuada elit consequat. Maecenas sed lectus nec lectus auctor iaculis. Morbi lectus massa, euismod blandit ante et, fringilla malesuada leo. Duis maximus scelerisque nulla id consequat. Cras pulvinar efficitur erat, ac luctus mi. Quisque varius fringilla orci, sit amet laoreet ante accumsan sit amet. Mauris congue porta tellus, a vehicula tellus consequat in. Sed at elit justo"
                )
            )
            list.add(
                Puppy(
                    "Bull Dog",
                    R.drawable.bull_dog_puppy,
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque lorem neque, pharetra bibendum turpis ut, sodales pellentesque nisl. Morbi cursus hendrerit efficitur. Nulla efficitur eleifend mattis. Morbi metus dui, tincidunt vitae sodales non, lobortis sit amet sem. Pellentesque quis molestie ex, at cursus nisl. Aenean laoreet ante vitae sapien convallis ullamcorper. Suspendisse malesuada nibh ut fringilla egestas. Etiam pretium nibh id dolor mollis, sed malesuada elit consequat. Maecenas sed lectus nec lectus auctor iaculis. Morbi lectus massa, euismod blandit ante et, fringilla malesuada leo. Duis maximus scelerisque nulla id consequat. Cras pulvinar efficitur erat, ac luctus mi. Quisque varius fringilla orci, sit amet laoreet ante accumsan sit amet. Mauris congue porta tellus, a vehicula tellus consequat in. Sed at elit justo"
                )
            )
            list.add(
                Puppy(
                    "French Bull Dog",
                    R.drawable.french_bull_dog_white,
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque lorem neque, pharetra bibendum turpis ut, sodales pellentesque nisl. Morbi cursus hendrerit efficitur. Nulla efficitur eleifend mattis. Morbi metus dui, tincidunt vitae sodales non, lobortis sit amet sem. Pellentesque quis molestie ex, at cursus nisl. Aenean laoreet ante vitae sapien convallis ullamcorper. Suspendisse malesuada nibh ut fringilla egestas. Etiam pretium nibh id dolor mollis, sed malesuada elit consequat. Maecenas sed lectus nec lectus auctor iaculis. Morbi lectus massa, euismod blandit ante et, fringilla malesuada leo. Duis maximus scelerisque nulla id consequat. Cras pulvinar efficitur erat, ac luctus mi. Quisque varius fringilla orci, sit amet laoreet ante accumsan sit amet. Mauris congue porta tellus, a vehicula tellus consequat in. Sed at elit justo"
                )
            )
            list.add(
                Puppy(
                    "German Shepherd",
                    R.drawable.german_shepherd_puppy,
                    " Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque lorem neque, pharetra bibendum turpis ut, sodales pellentesque nisl. Morbi cursus hendrerit efficitur. Nulla efficitur eleifend mattis. Morbi metus dui, tincidunt vitae sodales non, lobortis sit amet sem. Pellentesque quis molestie ex, at cursus nisl. Aenean laoreet ante vitae sapien convallis ullamcorper. Suspendisse malesuada nibh ut fringilla egestas. Etiam pretium nibh id dolor mollis, sed malesuada elit consequat. Maecenas sed lectus nec lectus auctor iaculis. Morbi lectus massa, euismod blandit ante et, fringilla malesuada leo. Duis maximus scelerisque nulla id consequat. Cras pulvinar efficitur erat, ac luctus mi. Quisque varius fringilla orci, sit amet laoreet ante accumsan sit amet. Mauris congue porta tellus, a vehicula tellus consequat in. Sed at elit justo"
                )
            )
            list.add(
                Puppy(
                    "Golden Retriever",
                    R.drawable.golden_retriever_puppy,
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque lorem neque, pharetra bibendum turpis ut, sodales pellentesque nisl. Morbi cursus hendrerit efficitur. Nulla efficitur eleifend mattis. Morbi metus dui, tincidunt vitae sodales non, lobortis sit amet sem. Pellentesque quis molestie ex, at cursus nisl. Aenean laoreet ante vitae sapien convallis ullamcorper. Suspendisse malesuada nibh ut fringilla egestas. Etiam pretium nibh id dolor mollis, sed malesuada elit consequat. Maecenas sed lectus nec lectus auctor iaculis. Morbi lectus massa, euismod blandit ante et, fringilla malesuada leo. Duis maximus scelerisque nulla id consequat. Cras pulvinar efficitur erat, ac luctus mi. Quisque varius fringilla orci, sit amet laoreet ante accumsan sit amet. Mauris congue porta tellus, a vehicula tellus consequat in. Sed at elit justo"
                )
            )
            list.add(
                Puppy(
                    "Labrador Retriever",
                    R.drawable.labrodor_puppy_white,
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque lorem neque, pharetra bibendum turpis ut, sodales pellentesque nisl. Morbi cursus hendrerit efficitur. Nulla efficitur eleifend mattis. Morbi metus dui, tincidunt vitae sodales non, lobortis sit amet sem. Pellentesque quis molestie ex, at cursus nisl. Aenean laoreet ante vitae sapien convallis ullamcorper. Suspendisse malesuada nibh ut fringilla egestas. Etiam pretium nibh id dolor mollis, sed malesuada elit consequat. Maecenas sed lectus nec lectus auctor iaculis. Morbi lectus massa, euismod blandit ante et, fringilla malesuada leo. Duis maximus scelerisque nulla id consequat. Cras pulvinar efficitur erat, ac luctus mi. Quisque varius fringilla orci, sit amet laoreet ante accumsan sit amet. Mauris congue porta tellus, a vehicula tellus consequat in. Sed at elit justo"
                )
            )
            list.add(
                Puppy(
                    "Pug",
                    R.drawable.pug_puppy_white,
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque lorem neque, pharetra bibendum turpis ut, sodales pellentesque nisl. Morbi cursus hendrerit efficitur. Nulla efficitur eleifend mattis. Morbi metus dui, tincidunt vitae sodales non, lobortis sit amet sem. Pellentesque quis molestie ex, at cursus nisl. Aenean laoreet ante vitae sapien convallis ullamcorper. Suspendisse malesuada nibh ut fringilla egestas. Etiam pretium nibh id dolor mollis, sed malesuada elit consequat. Maecenas sed lectus nec lectus auctor iaculis. Morbi lectus massa, euismod blandit ante et, fringilla malesuada leo. Duis maximus scelerisque nulla id consequat. Cras pulvinar efficitur erat, ac luctus mi. Quisque varius fringilla orci, sit amet laoreet ante accumsan sit amet. Mauris congue porta tellus, a vehicula tellus consequat in. Sed at elit justo"
                )
            )
            list.add(
                Puppy(
                    "Rottweiler",
                    R.drawable.rotweiler_puppy_white,
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque lorem neque, pharetra bibendum turpis ut, sodales pellentesque nisl. Morbi cursus hendrerit efficitur. Nulla efficitur eleifend mattis. Morbi metus dui, tincidunt vitae sodales non, lobortis sit amet sem. Pellentesque quis molestie ex, at cursus nisl. Aenean laoreet ante vitae sapien convallis ullamcorper. Suspendisse malesuada nibh ut fringilla egestas. Etiam pretium nibh id dolor mollis, sed malesuada elit consequat. Maecenas sed lectus nec lectus auctor iaculis. Morbi lectus massa, euismod blandit ante et, fringilla malesuada leo. Duis maximus scelerisque nulla id consequat. Cras pulvinar efficitur erat, ac luctus mi. Quisque varius fringilla orci, sit amet laoreet ante accumsan sit amet. Mauris congue porta tellus, a vehicula tellus consequat in. Sed at elit justo"
                )
            )
            list.add(
                Puppy(
                    "Yorkshire Terrier",
                    R.drawable.yorkshire_terrier_puppy_white,
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque lorem neque, pharetra bibendum turpis ut, sodales pellentesque nisl. Morbi cursus hendrerit efficitur. Nulla efficitur eleifend mattis. Morbi metus dui, tincidunt vitae sodales non, lobortis sit amet sem. Pellentesque quis molestie ex, at cursus nisl. Aenean laoreet ante vitae sapien convallis ullamcorper. Suspendisse malesuada nibh ut fringilla egestas. Etiam pretium nibh id dolor mollis, sed malesuada elit consequat. Maecenas sed lectus nec lectus auctor iaculis. Morbi lectus massa, euismod blandit ante et, fringilla malesuada leo. Duis maximus scelerisque nulla id consequat. Cras pulvinar efficitur erat, ac luctus mi. Quisque varius fringilla orci, sit amet laoreet ante accumsan sit amet. Mauris congue porta tellus, a vehicula tellus consequat in. Sed at elit justo"
                )
            )

            return list

        }

        fun getColor(colorString: String): Color {
            return Color(android.graphics.Color.parseColor("#$colorString"))
        }
    }
}


@Composable
fun Greeting(puppy: Puppy) {
    var isSelected by remember { mutableStateOf(false) }
    val backgroundColor by animateColorAsState(if (isSelected) Color.Red else Color.Transparent)
    val context = LocalContext.current


    Row(verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = painterResource(id = puppy.resId),
            contentDescription = null,
            modifier = Modifier
                .size(240.dp, 240.dp)
                .padding(24.dp)
                .background(color = backgroundColor)
                .clickable(onClick = {
                    val intent = Intent(context, MainActivity::class.java)
                    intent.putExtra("res_id", puppy.resId)
                    intent.putExtra("pup_name", puppy.pupName)
                    intent.putExtra("lorem_ipsum", puppy.loremIpsum)
                    context.startActivity(intent)
                })
                .clip(shape = RoundedCornerShape(4.dp)),
            contentScale = ContentScale.Crop,
        )
    }

    Text(
        text = puppy.pupName,
        textAlign = TextAlign.Center,
        maxLines = 2,
        style = MaterialTheme.typography.h6,
        overflow = TextOverflow.Ellipsis
    )

    Spacer(modifier = Modifier.height(16.dp))

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApp {
        MyScreenContent(ListOfDogsActivity.getPuppies())
    }
}

//@Composable
//fun MyScreenContent() {
//    Column {
//        Greeting("Android")
//        Divider(color = Color.Black)
//        Greeting("there")
//    }
//}

@Composable
fun MyApp(content: @Composable () -> Unit) {
    PawAndroidDevChallengeTheme() {
        Surface(color = ListOfDogsActivity.getColor("FBE9D1")) {
            content()
        }
    }
}

@Composable
fun MyScreenContent(names: List<Puppy>) {
    val counterState = remember { mutableStateOf(0) }
    Column(
        modifier = Modifier
            .fillMaxHeight()
    ) {
        NameList(names, Modifier.weight(1f))
    }
}

@Composable
fun Counter(count: Int, updateCount: (Int) -> Unit) {
    Button(
        onClick = { updateCount(count + 1) },
        colors = ButtonDefaults.buttonColors(
            backgroundColor = if (count > 5) Color.Green else Color.White
        )
    ) {
        Text("I've been clicked $count times")
    }
}

@Composable
fun NameList(puppy: List<Puppy>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        items(items = puppy) { puppy ->
            Greeting(puppy = puppy)
            Divider(
                modifier = Modifier.padding(8.dp, 0.dp, 8.dp, 0.dp),
                color = ListOfDogsActivity.getColor("7B4B2A"),
                thickness = 0.7.dp

            )
        }
    }

}