<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
xmlns:android="http://schemas.android.com/apk/res/android"
android:layout_width="match_parent"
android:layout_height="match_parent"
android:orientation="vertical"
android:padding="16dp">

<TextView
android:id="@+id/myTextView"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:text="Enter your name:" />

<EditText
android:id="@+id/myEditText"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:inputType="textPersonName" />

<Button
android:id="@+id/myButton"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Say Hello" />

</LinearLayout>
