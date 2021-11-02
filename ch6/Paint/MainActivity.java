<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/layout"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:background="#dddddd">

    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="0dp"
        android:layout_weight="1"
        android:layout_gravity="center_horizontal"
        android:orientation="horizontal"
        android:padding="0px" >
        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent">
            <ImageButton
                android:id="@+id/poubelle_button"
                android:layout_width="50px"
                android:layout_height="50px"
                android:adjustViewBounds="true"
                android:layout_centerVertical="true"
                android:layout_margin="5dp"
                android:background="@drawable/trash"
                android:onClick="onPoubelleButton" />

            <ImageButton
                android:id="@+id/eraser_button"
                android:layout_width="50px"
                android:layout_height="50px"
                android:adjustViewBounds="true"                android:layout_toRightOf="@id/poubelle_button"
                android:layout_centerVertical="true"
                android:layout_margin="5dp"
                android:background="@drawable/eraser"
                android:onClick="onEraserButton" />
        </RelativeLayout>
    </LinearLayout>

    <FrameLayout
        android:id="@+id/frame_container"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="8"
        android:layout_marginHorizontal="5dp"
        android:background="#ffffff" >
    </FrameLayout>

    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="0dp"
        android:layout_weight="1"
        android:orientation="horizontal"
        android:layout_gravity="center_horizontal" >

        <ImageButton
            android:id="@+id/red_button"
            android:layout_width="25dp"
            android:layout_height="25dp"
            android:onClick="onColorButton"
            android:background="@drawable/shape1"
            android:layout_margin="3dp"/>
        <ImageButton
            android:id="@+id/green_button"
            android:layout_width="25dp"
            android:layout_height="25dp"
            android:onClick="onColorButton"
            android:background="@drawable/shape2"
            android:layout_margin="3dp" />
        <ImageButton
            android:id="@+id/blue_button"
            android:layout_width="25dp"
            android:layout_height="25dp"
            android:onClick="onColorButton"
            android:background="@drawable/shape3"
            android:layout_margin="3dp" />
    </LinearLayout>

</LinearLayout>
