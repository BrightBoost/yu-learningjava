## 🎵 Your OOP Exercise: Playlist!

### Step-by-step Instructions (if you want help along the way)

Create each class in its own file, in the same package or folder.

1. Create a `Song` class with `String title` and `String artist` fields.
2. Create a `Playlist` class with a `String name` field.
3. Add an `ArrayList<Song>` field to `Playlist` and initialize it as an empty list. Remember to import `java.util.ArrayList`.

   ```java
   ArrayList<Song> songs = new ArrayList<>();
   ```

4. Add an `addSong(Song song)` method that adds the provided song to the list using `songs.add(song)`.
5. Add a `printSongs()` method. Print the playlist name, then use a loop to print each song's title and artist.
6. If the list is empty, print a friendly message such as `No songs yet`. You can use `songs.isEmpty()` to check.
7. In `App`'s `main` method, create at least three songs and add them to one playlist. Print it.
8. Create a second, empty playlist and print it too.

### 💡 Bonus

Give `Song` a method that prints a pretend "Now playing" message.
