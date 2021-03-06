package com.example.android.miwok;

/**
 * Created by kengshing.aw on 3/22/2018.
 */

class Word {

    private static final int NO_IMAGE_PROVIDED = -1;
    private final String mDefaultTranslation;
    private final String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private final int mVoiceResouorceId;

    Word(String defaultTranslation, String miwokTranslation, int voiceResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mVoiceResouorceId = voiceResourceId;
    }

    Word(String defaultTranslation, String miwokTranslation, int voiceResourceId, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mVoiceResouorceId = voiceResourceId;
        mImageResourceId = imageResourceId;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getmVoiceResouorceId() {
        return mVoiceResouorceId;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mVoiceResouorceId=" + mVoiceResouorceId +
                '}';
    }
}

