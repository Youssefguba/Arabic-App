package com.example.android.miwok;

/**
         * {@link Word} represents a vocabulary word that the user wants to learn.
         * It contains a default translation and a Miwok translation for that word.
         */
        public class Word {

    /**
     * Default translation for the word
     */
    private  String mDefaultTranslation;

    /**
     * Arabic translation for the word
     */
    private  String mArabicTranslation;
    /**
     * Image Resource
     */
    private  int mImageResource = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     *
     * Audio Resource
     */
    private int mAudioResourceId ;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param arabicTranslation  is the word in the Arabic language
     */
    protected Word(String defaultTranslation, String arabicTranslation, int imageResource, int englishPlayer) {
        mDefaultTranslation = defaultTranslation;
        mArabicTranslation = arabicTranslation;
        mImageResource = imageResource;
        mAudioResourceId = englishPlayer;
    }

    public  Word(String defaultTranslation, String arabicTranslation, int audioResource ) {
        mDefaultTranslation = defaultTranslation;
        mArabicTranslation = arabicTranslation;
        mAudioResourceId = audioResource;

    }

    /**
     * Get the default translation of the word.
     */
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Arabic translation of the word.
     */
    public String getmArabicTranslation() {
        return mArabicTranslation;
    }

    public int getmImageResource() {
        return mImageResource;
    }


    public boolean hasImage() {
        return mImageResource != NO_IMAGE_PROVIDED;
    }


    public int getmAudioResourceId() {
        return  mAudioResourceId  ;
    }


}