/*
 * JavaFX Music Player. The MIT License (MIT).
 * Copyright (c) Almas Baim.
 * Copyright (c) Gerardo Prada, Michael Martin.
 * See LICENSE for details.
 */

package app.musicplayer.events;

import app.musicplayer.model.Playlist;
import app.musicplayer.model.Song;
import javafx.event.EventType;

/**
 * @author Almas Baim (https://github.com/AlmasB)
 */
public class UserDataEvent<T> extends UserEvent {

    public static final EventType<UserDataEvent<?>> ANY = new EventType<>(UserEvent.ANY, "USER_DATA_EVENT_ANY");

    public static final EventType<UserDataEvent<?>> PLAY_SONG = new EventType<>(ANY, "PLAY_SONG_DATA_EVENT");
    public static final EventType<UserDataEvent<?>> LOAD_SONG_ARTWORK = new EventType<>(ANY, "LOAD_SONG_ARTWORK_DATA_EVENT");
    public static final EventType<UserDataEvent<?>> NAVIGATE_TO_SONG = new EventType<>(ANY, "NAVIGATE_TO_SONG_DATA_EVENT");

    private T data;

    public UserDataEvent(EventType<? extends UserDataEvent> eventType, T data) {
        super(eventType);
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public record PlaylistAndSong(Playlist playlist, Song song) {}
}
