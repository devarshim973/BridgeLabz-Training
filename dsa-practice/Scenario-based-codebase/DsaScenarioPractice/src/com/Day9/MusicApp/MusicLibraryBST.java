package com.Day9.MusicApp;

class MusicLibraryBST {

    // Song node class
    static class SongNode {
        int trackId;
        String songTitle;
        String artistName;
        SongNode left;
        SongNode right;

        SongNode(int trackId, String songTitle, String artistName) {
            this.trackId = trackId;
            this.songTitle = songTitle;
            this.artistName = artistName;
        }
    }

    private SongNode root;

    // 1️⃣ Insert new track (BST based on song title)
    void addSong(int trackId, String songTitle, String artistName) {
        root = insertSong(root, trackId, songTitle, artistName);
    }

    private SongNode insertSong(SongNode current, int trackId, String songTitle, String artistName) {
        if (current == null) {
            return new SongNode(trackId, songTitle, artistName);
        }

        if (songTitle.compareToIgnoreCase(current.songTitle) < 0) {
            current.left = insertSong(current.left, trackId, songTitle, artistName);
        } else {
            current.right = insertSong(current.right, trackId, songTitle, artistName);
        }

        return current;
    }

    // 2️⃣ Search track using Track ID
    SongNode searchByTrackId(int trackId) {
        return searchTrack(root, trackId);
    }

    private SongNode searchTrack(SongNode current, int trackId) {
        if (current == null) {
            return null;
        }

        if (current.trackId == trackId) {
            return current;
        }

        SongNode leftResult = searchTrack(current.left, trackId);
        if (leftResult != null) {
            return leftResult;
        }

        return searchTrack(current.right, trackId);
    }

    // 3️⃣ Display playlist alphabetically (In-order traversal)
    void displayPlaylistAlphabetically() {
        inorderTraversal(root);
    }

    private void inorderTraversal(SongNode current) {
        if (current != null) {
            inorderTraversal(current.left);
            System.out.println(
                "Track ID: " + current.trackId +
                ", Title: " + current.songTitle +
                ", Artist: " + current.artistName
            );
            inorderTraversal(current.right);
        }
    }

    public static void main(String[] args) {

        MusicLibraryBST library = new MusicLibraryBST();

        // Scenario 2: Insert new tracks
        library.addSong(501, "Shape of You", "Ed Sheeran");
        library.addSong(502, "Believer", "Imagine Dragons");
        library.addSong(503, "Attention", "Charlie Puth");
        library.addSong(504, "Perfect", "Ed Sheeran");
        library.addSong(505, "Closer", "The Chainsmokers");

        // Scenario 3: Display playlist alphabetically
        System.out.println("🎶 Playlist (Alphabetical Order):");
        library.displayPlaylistAlphabetically();

        // Scenario 1: Search by Track ID
        System.out.println("\n🔍 Searching for Track ID 503:");
        SongNode song = library.searchByTrackId(503);
        if (song != null) {
            System.out.println(
                "Found → " + song.songTitle + " by " + song.artistName
            );
        } else {
            System.out.println("Song not found");
        }
    }
}
