package com.example.mynotes.Interface;

import androidx.cardview.widget.CardView;

import com.example.mynotes.Model.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongPress(Notes notes, CardView cardView);
}
