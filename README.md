Architecture starter template (multi-module)
==================

This template is compatible with the latest **stable** version of Android Studio and based on [android architecture templates](https://github.com/android/architecture-templates).

What's the difference?
* Move core modules under /core directory.
* Move feature module under /feature directory.
* Add convention plugins to remove boilerplate code in build files.

![Screenshot](https://github.com/android/architecture-templates/raw/main/screenshots.png)

## Features

* Room Database
* Hilt
* ViewModel, read+write
* UI in Compose, list + write (Material3)
* Navigation
* Repository and data source
* Kotlin Coroutines and Flow
* Unit tests
* UI tests using fake data with Hilt

## Usage

1. Clone this branch

```
git clone https://github.com/ghatasheh/android_multimodule_template.git
```


2. Run the customizer script:

```
./customizer.sh your.package.name DataItemType [MyApplication]
```

Where `your.package.name` is your app ID (should be lowercase) and `DataItemType` is used for the
name of the screen, exposed state and data base entity (should be PascalCase). You can add an optional application name.

# License

Now in Android is distributed under the terms of the Apache License (Version 2.0). See the
[license](LICENSE) for more information.
