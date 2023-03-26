package com.koba.data_implement.provider;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/koba/data_implement/provider/ImageSharedPreferenceProvider;", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "contain", "", "key", "", "getAll", "", "remove", "", "setLong", "value", "", "Companion", "data-implement_debug"})
public final class ImageSharedPreferenceProvider {
    private final android.content.SharedPreferences sharedPreferences = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.koba.data_implement.provider.ImageSharedPreferenceProvider.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREFERENCE_NAME = "search_image_preference";
    
    @javax.inject.Inject()
    public ImageSharedPreferenceProvider(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences) {
        super();
    }
    
    public final void setLong(@org.jetbrains.annotations.NotNull()
    java.lang.String key, long value) {
    }
    
    public final void remove(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
    }
    
    public final boolean contain(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.Object> getAll() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/koba/data_implement/provider/ImageSharedPreferenceProvider$Companion;", "", "()V", "PREFERENCE_NAME", "", "data-implement_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}