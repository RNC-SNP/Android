package com.azure.graphview;

import com.azure.graphview.GraphView.GraphViewData;

public interface ValueDependentColor {
	public int get(GraphViewData data);
}
