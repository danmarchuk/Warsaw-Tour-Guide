package com.example.android.warsawtourguide;

public class Place {

    private int mImage = NO_IMAGE_PROVIDED;
    private String mPlaceName;
    private String mPlaceDescription;
    private static final int NO_IMAGE_PROVIDED = -1;


    public Place(String name, String description, int image) {
        mPlaceName = name;
        mPlaceDescription = description;
        mImage = image;
    }

    public Place(String name, String description) {
        mPlaceName = name;
        mPlaceDescription = description;
    }

    public String getName() {return mPlaceName;}
    public String getDescription() {return mPlaceDescription;}
    public int getImage() {return mImage;}
    public boolean hasImage(){
        return mImage != NO_IMAGE_PROVIDED;
    }
}

