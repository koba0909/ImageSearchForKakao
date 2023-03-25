// Generated by data binding compiler. Do not edit!
package com.koba.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.koba.domain.model.ImageModel;
import com.koba.search.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class HolderSearchResultBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imageViewThumbnail;

  @Bindable
  protected ImageModel mImageModel;

  protected HolderSearchResultBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView imageViewThumbnail) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageViewThumbnail = imageViewThumbnail;
  }

  public abstract void setImageModel(@Nullable ImageModel imageModel);

  @Nullable
  public ImageModel getImageModel() {
    return mImageModel;
  }

  @NonNull
  public static HolderSearchResultBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.holder_search_result, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static HolderSearchResultBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<HolderSearchResultBinding>inflateInternal(inflater, R.layout.holder_search_result, root, attachToRoot, component);
  }

  @NonNull
  public static HolderSearchResultBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.holder_search_result, null, false, component)
   */
  @NonNull
  @Deprecated
  public static HolderSearchResultBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<HolderSearchResultBinding>inflateInternal(inflater, R.layout.holder_search_result, null, false, component);
  }

  public static HolderSearchResultBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static HolderSearchResultBinding bind(@NonNull View view, @Nullable Object component) {
    return (HolderSearchResultBinding)bind(component, view, R.layout.holder_search_result);
  }
}
