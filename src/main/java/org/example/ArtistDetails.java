package org.example;

public class ArtistDetails implements Artist{
    private String artistName;
    @Override
    public String getName() {
        return artistName;
    }

    @Override
    public void setName(String name) {
        this.artistName = name;
    }
}
