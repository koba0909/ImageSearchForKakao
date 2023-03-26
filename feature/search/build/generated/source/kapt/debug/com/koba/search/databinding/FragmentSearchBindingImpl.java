package com.koba.search.databinding;
import com.koba.search.R;
import com.koba.search.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSearchBindingImpl extends FragmentSearchBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.search_view, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.ProgressBar mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSearchBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentSearchBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (androidx.appcompat.widget.SearchView) bindings[4]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.ProgressBar) bindings[3];
        this.mboundView3.setTag(null);
        this.recyclerviewSearchResult.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.uiState == variableId) {
            setUiState((com.koba.search.SearchUIState) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.koba.search.SearchViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUiState(@Nullable com.koba.search.SearchUIState UiState) {
        this.mUiState = UiState;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.uiState);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.koba.search.SearchViewModel ViewModel) {
        this.mViewModel = ViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.koba.search.SearchUIState uiState = mUiState;
        boolean uiStateInstanceofSearchUIStateEmpty = false;
        boolean uiStateInstanceofSearchUIStateLoading = false;
        boolean uiStateInstanceofSearchUIStateShow = false;

        if ((dirtyFlags & 0x5L) != 0) {



                // read uiState instanceof SearchUIState.Empty
                uiStateInstanceofSearchUIStateEmpty = uiState instanceof com.koba.search.SearchUIState.Empty;
                // read uiState instanceof SearchUIState.Loading
                uiStateInstanceofSearchUIStateLoading = uiState instanceof com.koba.search.SearchUIState.Loading;
                // read uiState instanceof SearchUIState.Show
                uiStateInstanceofSearchUIStateShow = uiState instanceof com.koba.search.SearchUIState.Show;
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.koba.base.BaseBindingAdapterKt.isVisible(this.mboundView2, uiStateInstanceofSearchUIStateEmpty);
            com.koba.base.BaseBindingAdapterKt.isVisible(this.mboundView3, uiStateInstanceofSearchUIStateLoading);
            com.koba.base.BaseBindingAdapterKt.isVisible(this.recyclerviewSearchResult, uiStateInstanceofSearchUIStateShow);
            com.koba.search.SearchBindingAdapterKt.bindSearchList(this.recyclerviewSearchResult, uiState);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): uiState
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}