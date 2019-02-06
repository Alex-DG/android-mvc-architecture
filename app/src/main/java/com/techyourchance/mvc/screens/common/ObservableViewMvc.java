package com.techyourchance.mvc.screens.common;

public interface ObservableViewMvc<ListenerType> extends ViewMvc {
    void registerListerner(ListenerType listener);

    void unregisterListener(ListenerType listener);
}
