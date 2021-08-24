# 암시적 인텐트 데모 프로젝트

## 인텐트 필터 구성하기

```xml
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.lilcode.example.intentfilterwebview">

    <uses-permission android:name="android.permission.INTERNET"/>

    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/Theme.IntentFilterWebView"
        android:usesCleartextTraffic="true">
        <activity
            android:name=".MainActivity"
            android:exported="true">
            <intent-filter>
                <action android:name="android.intent.action.VIEW"/>
                <category android:name="android.intent.category.BROWSABLE"/>
                <category android:name="android.intent.category.DEFAULT"/>
<!--                <data android:scheme="http" android:host="whyprogrammer.tistory.com"/>-->
                <data android:scheme="http" android:host="*"/> 
<!--                모든 URL을 지원하기 (*)-->
            </intent-filter>
        </activity>
    </application>

</manifest>
```