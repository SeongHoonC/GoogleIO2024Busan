package com.example.googleio2024

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.ImageLoader
import coil.compose.rememberAsyncImagePainter
import coil.decode.ImageDecoderDecoder
import coil.request.CachePolicy
import coil.request.ImageRequest
import coil.size.Size
import com.example.googleio2024.model.Event
import com.example.googleio2024.model.Organizer
import com.example.googleio2024.model.gdgBusanEvents
import com.example.googleio2024.model.gdgBusanOrganizers
import com.example.googleio2024.ui.theme.GoogleIo2024Theme

@Composable
fun GdgBusanScreen(innerPadding: PaddingValues) {
    LazyColumn(
        modifier = Modifier.padding(innerPadding),
    ) {
        item { EventTitle() }
        item { GoogleIo2024(modifier = Modifier.padding(horizontal = 12.dp)) }
        item { Organizers(gdgBusanOrganizers) }
        PastEvents(gdgBusanEvents)
    }
}

@Composable
private fun EventTitle() {
    Text(
        modifier = Modifier.padding(16.dp),
        text = "Now Here!",
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold,
    )
}

@Composable
private fun GoogleIo2024(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    val imageLoader =
        ImageLoader
            .Builder(context)
            .memoryCachePolicy(CachePolicy.ENABLED)
            .components { add(ImageDecoderDecoder.Factory()) }
            .build()
    Image(
        modifier =
            modifier
                .clip(RoundedCornerShape(20.dp))
                .fillMaxWidth()
                .wrapContentHeight(),
        painter =
            rememberAsyncImagePainter(
                ImageRequest
                    .Builder(context)
                    .data(data = R.drawable.watch_party)
                    .apply(block = { size(Size.ORIGINAL) })
                    .build(),
                imageLoader = imageLoader,
            ),
        contentScale = ContentScale.Crop,
        contentDescription = null,
    )
}

@Composable
private fun Organizers(organizers: List<Organizer>) {
    OrganizersTitle()
    LazyRow(
        modifier = Modifier.wrapContentSize(),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        itemsIndexed(organizers) { index, organizer ->
            if (index == 0) {
                OrganizerCard(
                    modifier =
                        Modifier
                            .padding(start = 20.dp)
                            .width(100.dp),
                    organizer = organizer,
                )
            } else {
                OrganizerCard(
                    modifier = Modifier.width(100.dp),
                    organizer = organizer,
                )
            }
        }
    }
}

@Composable
private fun OrganizersTitle() {
    Text(
        modifier = Modifier.padding(16.dp),
        text = "Organizers",
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
    )
}

private fun LazyListScope.PastEvents(events: List<Event>) {
    item { PastEventTitle() }
    items(events) { event ->
        EventCard(
            modifier =
                Modifier
                    .wrapContentHeight()
                    .padding(vertical = 12.dp, horizontal = 16.dp),
            event = event,
        )
    }
}

@Composable
private fun PastEventTitle() {
    Text(
        modifier = Modifier.padding(16.dp),
        text = "Past Events",
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GoogleIo2024Theme {
        GoogleIo2024()
    }
}
