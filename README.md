# Kotlin-SafeArgs-Custom-Object
Its a small example with Custom Employee object is sent from one Fragment to another. 


Dependencies used

```
//    Navigation Component
    implementation 'androidx.navigation:navigation-fragment-ktx:2.3.5'
    implementation 'androidx.navigation:navigation-ui-ktx:2.3.5'

```

In the Plugins section the gradel file you will need to add following details

```
  id 'androidx.navigation.safeargs.kotlin'
  id 'kotlin-parcelize'

```

In the build.gradel for project under the dependencies section you will need to add the following

```
classpath "androidx.navigation:navigation-safe-args-gradle-plugin:2.3.0"
```

So finally build.gradel for project will look as follows

```
dependencies {
        classpath "com.android.tools.build:gradle:7.0.0"
        classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.21"
        classpath "androidx.navigation:navigation-safe-args-gradle-plugin:2.3.0"

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
```

and 

build.gradel for Module

```
plugins {
    id 'com.android.application'
    id 'kotlin-android'
    id 'androidx.navigation.safeargs.kotlin'
    id 'kotlin-parcelize'

}

```



# Home Screen 
![alt text](/screenshots/home.PNG)

Here as you can see when we add the employee details and click on the "send data" button the details will be sent from homke screen to details screen


# Home Screen 
![alt text](/screenshots/details.PNG)

Here as you can see, the information added from home fragments are sent to the details fragment 
