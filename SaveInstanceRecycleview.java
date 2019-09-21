private static final String BUNDLE_RECYCLER_LAYOUT = "classname.recycler.layout";

@Override
public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
    super.onViewStateRestored(savedInstanceState);

    if(savedInstanceState != null)
    {
        Parcelable savedRecyclerLayoutState = savedInstanceState.getParcelable(BUNDLE_RECYCLER_LAYOUT);
        recyclerView.getLayoutManager().onRestoreInstanceState(savedRecyclerLayoutState);
    }
}

@Override
public void onSaveInstanceState(Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putParcelable(BUNDLE_RECYCLER_LAYOUT, recyclerView.getLayoutManager().onSaveInstanceState());
}
