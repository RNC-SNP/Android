package com.example.rincliu.recyclerview;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by RincLiu on 3/18/15.
 */
public class DividerItemDecoration extends RecyclerView.ItemDecoration {
    private int padding;

    public DividerItemDecoration(int padding) {
        this.padding = padding;
    }

    @Override public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        outRect.left += padding;
        outRect.right += padding;
    }
}
