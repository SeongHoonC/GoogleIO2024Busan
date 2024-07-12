package com.example.googleio2024

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.googleio2024.model.Event

@Composable
fun EventCard(
    event: Event,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier =
            modifier
                .height(120.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(8.dp))
                .border(
                    BorderStroke(0.5.dp, Color.LightGray),
                    shape = RoundedCornerShape(8.dp),
                ),
    ) {
        AsyncImage(
            modifier =
                Modifier
                    .size(120.dp)
                    .aspectRatio(1f),
            model = event.imageUrl,
            contentScale = ContentScale.Crop,
            contentDescription = null,
        )

        Box(
            modifier =
                Modifier
                    .height(120.dp)
                    .padding(start = 12.dp),
        ) {
            Text(
                modifier = Modifier.align(Alignment.TopStart).padding(top = 8.dp),
                text = event.name,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
            )
            Column(Modifier.align(Alignment.BottomStart)) {
                Text(
                    text = event.date,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                )
                Text(
                    text = event.category,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                )
            }
        }
    }
}

// Preview
@Composable
@Preview(showBackground = true)
fun EventCardPreview() {
    EventCard(
        event =
            Event(
                id = 1,
                name = "Google I/O 2024",
                imageUrl = "https://res.cloudinary.com/startup-grind/image/fetch/c_fill,w_500,h_500,g_center/c_fill,dpr_2.0,f_auto,g_center,q_auto:good/https://res.cloudinary.com/startup-grind/image/upload/c_fill%2Cdpr_2.0%2Cf_auto%2Cg_center%2Cq_auto:good/v1/gcs/platform-data-goog/event_banners/gdev-eccosystems-bevy-chapters-thumbnail_x4z1EBy.png",
                date = "2024.07.06",
                category = "Conference",
            ),
        modifier = Modifier.fillMaxWidth(),
    )
}
