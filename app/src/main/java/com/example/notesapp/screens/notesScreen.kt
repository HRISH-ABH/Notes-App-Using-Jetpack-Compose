package com.example.notesapp.screens

import android.R.color.black
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.notesapp.R
import com.example.notesapp.models.Notes

@Composable
@Preview(showBackground = true)
fun NotesScreen() {
    // Sample Notes List
    val notesList = listOf(
        Notes(
            "Title 1",
            "tLife is a journey of unexpected turns, where each day unfolds with a mix of opportunities and challenges. Imagine waking up to the golden rays of sunlight filtering through your window, filling the room with warmth and hope. You step outside, greeted by the crisp morning air, and notice how the world seems alive with possibilities. Each sound, from the rustling leaves to the distant hum of traffic, carries a story waiting to be discovered. Perhaps today, you'll meet someone who changes your perspective or stumble upon a moment of quiet reflection that sparks a new idea. Every experience, big or small, adds a unique thread to the tapestry of your existence."
        ),
        Notes("Title 2", "Description 2"),
        Notes("Title 3", "Description 3"),
        Notes("Title 4", "Description 4"),
        Notes("Title 5", "Description 5"),
        Notes("Title 2", "Description 2"),
        Notes("Title 3", "Description 3"),
        Notes("Title 4", "Description 4"),
        Notes("Title 5", "Description 5"),
        Notes("Title 1", "Description 1"),
        Notes("Title 2", "Description 2"),
        Notes("Title 3", "Description 3"),
        Notes("Title 4", "Description 4"),
        Notes("Title 5", "Description 5"),
        Notes("Title 1", "Description 1"),
        Notes("Title 2", "Description 2"),
        Notes("Title 3", "Description 3"),
        Notes("Title 4", "Description 4"),
        Notes("Title 5", "Description 5")
    )

    Scaffold(floatingActionButton = {
        // Add Floating Action Button Logic (if needed)
    }) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .background(Color.Black)
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                // Header Section
                Row(
                    verticalAlignment = androidx.compose.ui.Alignment.CenterVertically,
                    modifier = Modifier.padding(bottom = 16.dp)
                ) {
                    IconButton(onClick = { /* Menu Action */ }) {
                        Icon(
                            imageVector = Icons.Filled.Menu,
                            contentDescription = "Menu Button",
                            tint = Color.White
                        )
                    }
                    Text(
                        text = "Create Notes",
                        style = TextStyle(
                            fontSize = 32.sp,
                            color = Color.White
                        ),
                        modifier = Modifier.padding(start = 8.dp)
                    )
                }

                // Notes List Section
                LazyColumn {
                    items(notesList) { note ->
                        Card(
                            modifier = Modifier
                                .padding(vertical = 8.dp)
                                .fillMaxWidth()
                        ) {
                            Column(modifier = Modifier.padding(16.dp)) {
                                Text(
                                    text = note.title,
                                    style = TextStyle(fontSize = 20.sp, color = Color.Black)
                                )
                                Text(
                                    text = note.description,
                                    style = TextStyle(fontSize = 16.sp, color = Color.Gray),
                                    modifier = Modifier.padding(top = 4.dp)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}
